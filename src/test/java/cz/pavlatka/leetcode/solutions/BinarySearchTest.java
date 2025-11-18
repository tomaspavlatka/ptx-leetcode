package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    BinarySearch solver;

    @BeforeEach
    void setUp() {
        solver = new BinarySearch();
    }

    @Test
    void test1() {
        var result = solver.solve(new int[]{-1,0,3,5,9,12}, 9);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void test2() {
        var result = solver.solve(new int[]{-1,0,3,5,9,12}, 2);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    void test3() {
        var result = solver.solve(new int[]{5}, 5);

        Assertions.assertThat(result).isEqualTo(0);
    }
}