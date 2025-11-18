package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters solver;

    @BeforeEach
    void setUp() {
        solver = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void test1() {
        var result = solver.solve("abcabcbb");

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var result = solver.solve("bbbbb");

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() {
        var result = solver.solve("pwwkew");

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test4() {
        var result = solver.solve(" ");

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test5() {
        var result = solver.solve("");

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void test6() {
        var result = solver.solve("au");

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test7() {
        var result = solver.solve("aab");

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test8() {
        var result = solver.sliding("abcabcbb");

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test9() {
        var result = solver.sliding("bbbbb");

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test10() {
        var result = solver.sliding("pwwkew");

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test11() {
        var result = solver.sliding(" ");

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test12() {
        var result = solver.sliding("");

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void test13() {
        var result = solver.sliding("au");

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test14() {
        var result = solver.properSliding("aab");

        Assertions.assertThat(result).isEqualTo(2);
    }
}