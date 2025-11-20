package cz.pavlatka.leetcode.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubSetTest {
    SubSet solver;

    @BeforeEach
    void setUp() {
        solver = new SubSet();
    }

    @Test
    void test1() {
        var result = solver.subsets(new int[]{1,2,3});
        assertThat(result).containsExactlyInAnyOrderElementsOf(
                List.of(
                        List.of(),
                        List.of(1),
                        List.of(2),
                        List.of(1,2),
                        List.of(3),
                        List.of(1,3),
                        List.of(2,3),
                        List.of(1,2,3)
                )
        );
    }

    @Test
    void test2() {
        var result = solver.subsets(new int[]{0});
        assertThat(result).containsExactlyInAnyOrderElementsOf(
                List.of(
                        List.of(),
                        List.of(0)
                )
        );
    }

    @Test
    void test3() {
        var result = solver.subsets(new int[]{});
        assertThat(result).containsExactlyInAnyOrderElementsOf(
                List.of(
                        List.of()
                )
        );
    }
}