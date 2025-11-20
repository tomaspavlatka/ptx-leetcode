package cz.pavlatka.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters solver;

    @BeforeEach
    void setUp() {
        solver = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void test1() {
        var result = solver.naive("abcabcbb");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var result = solver.naive("abba");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        var result = solver.better("abcabcbb");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test4() {
        var result = solver.better("abba");
        assertThat(result).isEqualTo(2);
    }
}