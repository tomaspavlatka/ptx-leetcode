package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray solver;

    @BeforeEach
    void setUp() {
        solver = new SearchInRotatedSortedArray();
    }

    @Test
    void test1() {
        var result = solver.bruteForce(new int[]{4,5,6,7,0,1,2}, 0);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void test2() {
        var result = solver.bruteForce(new int[]{4,5,6,7,0,1,2}, 3);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    void test3() {
        var result = solver.bruteForce(new int[]{1}, 0);

        Assertions.assertThat(result).isEqualTo(-1);
    }
}