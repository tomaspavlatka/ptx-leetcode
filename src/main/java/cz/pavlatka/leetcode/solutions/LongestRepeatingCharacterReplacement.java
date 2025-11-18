package cz.pavlatka.leetcode.solutions;

public class LongestRepeatingCharacterReplacement {
    // Time: O(n)
    // Space: O(1)
    public int characterReplacement(String s, int k) {
        var char_counts = new int[26]; // O(26)
        var max = 0;
        var start = 0;
        var max_count = 0;

        for (int end = 0; end < s.length(); end++) { // O(n)
            char_counts[s.charAt(end) - 'A']++;
            var current_char_count = char_counts[s.charAt(end) - 'A'];
            max_count = Math.max(max_count, current_char_count);

            while (end - start - max_count + 1 > k) {
                char_counts[s.charAt(start) - 'A']--;
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
