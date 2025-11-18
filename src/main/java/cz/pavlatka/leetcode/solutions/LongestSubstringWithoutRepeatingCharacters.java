package cz.pavlatka.leetcode.solutions;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    // Time: O(n ^ 2)
    // Space: O(n)
    public int solve(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        var max = 0;

        var start = 0;
        var chars = s.toCharArray();
        var set = new HashSet<>();
        for (int i = start; i < chars.length; i++) { // O(n ^ 2)
            if (!set.contains(chars[i])) {
                set.add(chars[i]);
            } else {
                max = Math.max(max, set.size());
                set.clear();
                i = start;
                start++;
            }
        }

        return Math.max(max, set.size());
    }

    // Time: O(n ^ 2)
    // Space: O(n)
    public int sliding(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        var max = 0;

        var start = 0;
        var letters = s.split("");
        var map = new HashMap<String, Integer>();
        for (int i = start; i < letters.length; i++) { // O(n ^ 2) -- because we walk back and forth
            if (!map.containsKey(letters[i])) {
                map.put(letters[i], i);
            } else {
                max = Math.max(max, map.size()); // O(1)
                i = map.get(letters[i]); // 0(1)
                map.clear();
            }
        }

        return Math.max(max, map.size());
    }

    // Time: O(n)
    // Space: O(n)
    public int properSliding(String s) {
        var map = new HashMap<Character, Integer>();
        int max = 0;
        int start = 0; // left side of the window

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If character seen AND within the current window
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1; // move left side forward
            }

            map.put(c, end); // record latest position
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
