package cz.pavlatka.practice;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {
    public String solve(String root, String letters) {
        if (root == null || letters == null) {
            return "";
        }

        return backtrack(0, root, letters, new ArrayList<>(), new ArrayList<>());
    }

    private String backtrack(int start, String root, String letters, List<String> path, List<String> found) {
        if (found.size() == letters.length()) {
            return path.stream().reduce("", String::concat);
        }

        String shortest = null;
        for (int i = start; i < root.length(); i++) {
            var f = String.valueOf(root.charAt(i));
            path.add(f);
            if (letters.contains(f)) {
                found.add(f);
            }
            var list = backtrack(start + 1, root, letters, path, found);

            shortest = shortest == null || shortest.length() > list.length() ? list : shortest;
            path.removeLast();
        }

        return shortest;
    }
}
