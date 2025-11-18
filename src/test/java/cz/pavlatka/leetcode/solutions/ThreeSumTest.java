package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

class ThreeSumTest {

    ThreeSum solver;

    @BeforeEach
    void setUp() {
        solver = new ThreeSum();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{-1,0,1,2,-1,-4});

        Assertions.assertThat(result).hasSize(2);

        var sortedResult = result.stream().map(inner -> inner.stream().sorted().toList()).toList();
        var expected = Stream.of(List.of(-1, -1, 2), List.of(-1, 0, 1)).map(inner -> inner.stream().sorted().toList()).toList();
        Assertions.assertThat(sortedResult).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{0, 1, 1});

        Assertions.assertThat(result).hasSize(0);
    }

    @Test
    void test3() {
        var result = solver.bruteForce(new int[]{0, 0, 0});

        Assertions.assertThat(result).hasSize(1);

        var sortedResult = result.stream().map(inner -> inner.stream().sorted().toList()).toList();
        var expected = Stream.of(List.of(0, 0, 0)).map(inner -> inner.stream().sorted().toList()).toList();
        Assertions.assertThat(sortedResult).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test4() {
        var result = solver.improved(new int[]{-1,0,1,2,-1,-4});

        Assertions.assertThat(result).hasSize(2);

        var sortedResult = result.stream().map(inner -> inner.stream().sorted().toList()).toList();
        var expected = Stream.of(List.of(-1, -1, 2), List.of(-1, 0, 1)).map(inner -> inner.stream().sorted().toList()).toList();
        Assertions.assertThat(sortedResult).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test5() {
        var result = solver.improved(new int[]{0, 1, 1});

        Assertions.assertThat(result).hasSize(0);
    }

    @Test
    void test6() {
        var result = solver.improved(new int[]{0, 0, 0});

        Assertions.assertThat(result).hasSize(1);

        var sortedResult = result.stream().map(inner -> inner.stream().sorted().toList()).toList();
        var expected = Stream.of(List.of(0, 0, 0)).map(inner -> inner.stream().sorted().toList()).toList();
        Assertions.assertThat(sortedResult).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test7() {
        var result = solver.improved(new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10});

        Assertions.assertThat(result).hasSize(6);

        var sortedResult = result.stream().map(inner -> inner.stream().sorted().toList()).toList();
        var expected = Stream.of(
            List.of(-10,5,5),
            List.of(-5,0,5),
            List.of(-4,2,2),
            List.of(-3,-2,5),
            List.of(-3,1,2),
            List.of(-2,0,2)
        ).map(inner -> inner.stream().sorted().toList()).toList();
        Assertions.assertThat(sortedResult).containsExactlyInAnyOrderElementsOf(expected);
    }


}