package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement solver;

    @BeforeEach
    void setUp() {
        solver = new LongestRepeatingCharacterReplacement();
    }

    @Test
    void test1() {
        var result = solver.characterReplacement("ABAB", 2);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void test3() {
        var result = solver.characterReplacement("AABABBA", 0);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        var result = solver.characterReplacement("AABABBA", 1);

        Assertions.assertThat(result).isEqualTo(4);
    }
}