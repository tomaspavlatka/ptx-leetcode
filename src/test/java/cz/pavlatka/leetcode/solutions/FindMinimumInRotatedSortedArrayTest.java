package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray solver;

    @BeforeEach
    void setUp() {
        solver = new FindMinimumInRotatedSortedArray();
    }

    @Test
    void test1() {
        var result = solver.solve(new int[]{3,4,5,1,2});

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test2() {
        var result = solver.solve(new int[]{4,5,6,7,0,1,2});

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void test3() {
        var result = solver.solve(new int[]{11,13,15,17});

        Assertions.assertThat(result).isEqualTo(11);
    }

    @Test
    void test4() {
        var result = solver.solve(new int[]{});

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    void test5() {
        var result = solver.solve(new int[]{1});

        Assertions.assertThat(result).isEqualTo(1);
    }
    @Test
    void test6() {
        var result = solver.solve(new int[]{2, 1});

        Assertions.assertThat(result).isEqualTo(1);
    }
}