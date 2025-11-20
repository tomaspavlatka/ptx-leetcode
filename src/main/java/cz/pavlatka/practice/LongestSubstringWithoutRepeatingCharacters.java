package cz.pavlatka.practice;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int naive(String root) {
        var start = 0;
        var set = new HashSet<Character>();

        var maxLength = 0;
        for (int i = start; i < root.length(); i++) {
            var c = root.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
            } else {
                maxLength = Math.max(maxLength, set.size());
                start++;
                i = start;
                set.clear();
            }
        }

        maxLength = Math.max(maxLength, set.size());

        return maxLength;
    }

    public int better(String root) {
        var seen = new HashMap<Character, Integer>();

        var start = 0;
        var maxLength = 0;
        for (int i = start; i < root.length(); i++) {
            var c = root.charAt(i);
            if (seen.containsKey(c) && seen.get(c) >= start) {
                start = seen.get(c) + 1;
            }

            seen.put(c, i);

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
