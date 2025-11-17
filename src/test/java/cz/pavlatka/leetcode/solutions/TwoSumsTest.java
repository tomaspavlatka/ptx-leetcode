package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumsTest {
    TwoSums solver;
    @BeforeEach
    void setUp() {
        solver = new TwoSums();
    }

    @Test
    void test1() {
        var result = solver.solve(new int[]{2, 7, 11, 15}, 9);

        Assertions.assertThat(result).isEqualTo(new int[]{0, 1});
    }

    @Test
    void test2() {
        var result = solver.solve(new int[]{3, 2, 4}, 6);

        Assertions.assertThat(result).isEqualTo(new int[]{1, 2});
    }

    @Test
    void test3() {
        var result = solver.solve(new int[]{3, 3}, 6);

        Assertions.assertThat(result).isEqualTo(new int[]{0, 1});
    }

}