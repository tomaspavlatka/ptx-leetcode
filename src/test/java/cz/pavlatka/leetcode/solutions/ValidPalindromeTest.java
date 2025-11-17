package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    ValidPalindrome solver;

    @BeforeEach
    void setUp() {
        solver = new ValidPalindrome();
    }

    @Test
    void test1() {
        var result = solver.solve("A man, a plan, a canal: Panama");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void test2() {
        var result = solver.solve("race a car");

        Assertions.assertThat(result).isFalse();
    }

    @Test
    void test3() {
        var result = solver.solve(" ");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void test4() {
        var result = solver.solve("0P");

        Assertions.assertThat(result).isFalse();
    }

}