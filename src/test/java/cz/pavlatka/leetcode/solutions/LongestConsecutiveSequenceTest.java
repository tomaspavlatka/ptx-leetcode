package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence solver;

    @BeforeEach
    void setUp() {
        solver = new LongestConsecutiveSequence();
    }

    @Test
    void test1() {
        var nums = new int[]{100,4,200,1,3,2};
        var result = solver.solve(nums);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void test2() {
        var nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        var result = solver.solve(nums);

        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    void test3() {
        var nums = new int[]{1,0,1,2};
        var result = solver.solve(nums);

        Assertions.assertThat(result).isEqualTo(3);
    }
}