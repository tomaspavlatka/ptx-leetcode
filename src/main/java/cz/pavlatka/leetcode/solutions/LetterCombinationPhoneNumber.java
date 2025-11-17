package cz.pavlatka.leetcode.solutions;

import java.util.*;

public class LetterCombinationPhoneNumber {
    public List<String> solve(String digits) {
        var output = new LinkedList<String>();
        if (digits.isEmpty()) {
            return output;
        }
        output.add("");

        String[] char_map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(digits.charAt(i)));
            while (output.peek().length() == i) {
                var permutation = output.remove();
                for (var c : char_map[idx].toCharArray()) {
                    output.add(permutation + c);
                }
            }
        }

        return output;
    }
}
