package cz.pavlatka.leetcode.solutions;

// @see https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public boolean solve(String s) {
        var string = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (string.isEmpty()) {
            return true;
        }

        var start = 0;
        var end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
