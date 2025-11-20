package cz.pavlatka.leetcode.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationsTest {

    Permutations solver;

    @BeforeEach
    void setUp() {
        solver = new Permutations();
    }

    @Test
    void test1() {
        var result = solver.permute(new int[]{1,2,3});

        var expected  = List.of(List.of(1,2,3),List.of(1,3,2),List.of(2,1,3),List.of(2,3,1),List.of(3,1,2),List.of(3,2,1));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        var result = solver.permute(new int[]{0,1});

        var expected  = List.of(List.of(1, 0), List.of(0, 1));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test3() {
        var result = solver.permute(new int[]{1});

        var expected  = List.of(List.of(1));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }
}