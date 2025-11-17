package cz.pavlatka.leetcode.solutions;

import org.springframework.stereotype.Component;

@Component
public class ZigZagConversion {
    public String solve(String word, int rows) {
        if (rows == 1) {
            return word;
        }

        var increment = (rows - 1) * 2;
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < rows; r++) {
            for (int i = r; i < word.length(); i += increment) {
                result.append(word.charAt(i));
                if (r > 0 && r < rows - 1 && (i + increment - 2 * r) < word.length()) {
                    result.append(word.charAt(i + increment - 2 * r));
                }
            }
        }

        return result.toString();
    }
}
