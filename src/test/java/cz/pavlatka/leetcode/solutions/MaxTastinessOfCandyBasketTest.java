package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxTastinessOfCandyBasketTest {

    MaxTastinessOfCandyBasket solver;

    @BeforeEach
    void setUp() {
        solver = new MaxTastinessOfCandyBasket();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{13,5,1,8,21,2}, 3);

        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{1,3,1}, 2);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        var result = solver.bruteForce(new int[]{7,7,7,7}, 2);

        Assertions.assertThat(result).isEqualTo(0);
    }
}