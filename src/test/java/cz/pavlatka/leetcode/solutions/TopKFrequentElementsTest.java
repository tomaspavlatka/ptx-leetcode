package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    TopKFrequentElements solver;

    @BeforeEach
    void setUp() {
        solver = new TopKFrequentElements();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{1,1,1,2,2,3}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{1}, 1);

        Assertions.assertThat(result).hasSize(1);
        Assertions.assertThat(result).contains(1);
    }

    @Test
    void test3() {
        var result = solver.bruteForce(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }

    @Test
    void test4() {
        var result = solver.buckets(new int[]{1,1,1,2,2,3}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }

    @Test
    void test5() {
        var result = solver.buckets(new int[]{1}, 1);

        Assertions.assertThat(result).hasSize(1);
        Assertions.assertThat(result).contains(1);
    }

    @Test
    void test7() {
        var result = solver.bucketOn(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }

    @Test
    void test8() {
        var result = solver.bucketOn(new int[]{1,1,1,2,2,3}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }

    @Test
    void test9() {
        var result = solver.bucketOn(new int[]{1}, 1);

        Assertions.assertThat(result).hasSize(1);
        Assertions.assertThat(result).contains(1);
    }

    @Test
    void test6() {
        var result = solver.buckets(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);

        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result).contains(1, 2);
    }
}