package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf solver;

    @BeforeEach
    void setUp() {
        solver = new ProductOfArrayExceptSelf();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{1,2,3,4});

        Assertions.assertThat(result).contains(24, 12, 8, 6);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{-1,1,0,-3,3});

        Assertions.assertThat(result).contains(0,0,9,0,0);
    }

    @Test
    void test3() {
        var result = solver.withMemmory(new int[]{1,2,3,4});

        Assertions.assertThat(result).contains(24, 12, 8, 6);
    }

    @Test
    void test4() {
        var result = solver.withMemmory(new int[]{-1,1,0,-3,3});

        Assertions.assertThat(result).contains(0,0,9,0,0);
    }

    @Test
    void test5() {
        var result = solver.withSuffix(new int[]{1,2,3,4});

        Assertions.assertThat(result).contains(24, 12, 8, 6);
    }

    @Test
    void test6() {
        var result = solver.withSuffix(new int[]{-1,1,0,-3,3});

        Assertions.assertThat(result).contains(0,0,9,0,0);
    }
}