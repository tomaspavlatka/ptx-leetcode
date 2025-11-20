package cz.pavlatka.leetcode.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CombinationSumTest {

    CombinationSum solver;

    @BeforeEach
    void setUp() {
        solver = new CombinationSum();
    }

    @Test
    void test1() {
        var result = solver.combinationSum(new int[]{2,3,5}, 8);


        var expected = List.of(
                List.of(2,2,2,2),List.of(2,3,3),List.of(3,5)
        );
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        var result = solver.combinationSum(new int[]{2,3,6,7}, 7);

        var expected = List.of(
                List.of(2,2,3),List.of(7)
        );
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test3() {
        var result = solver.combinationSum(new int[]{2}, 1);

        assertThat(result).isEmpty();
    }
}