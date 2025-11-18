package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    ContainerWithMostWater solver;

    @BeforeEach
    void setUp() {
        solver = new ContainerWithMostWater();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{1,8,6,2,5,4,8,3,7});

        Assertions.assertThat(result).isEqualTo(49);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{1, 1});

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() {
        var result = solver.improved(new int[]{1,8,6,2,5,4,8,3,7});

        Assertions.assertThat(result).isEqualTo(49);
    }

    @Test
    void test4() {
        var result = solver.improved(new int[]{1, 1});

        Assertions.assertThat(result).isEqualTo(1);
    }

}