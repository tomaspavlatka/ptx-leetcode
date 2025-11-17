package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {
    GroupAnagrams solver;

    @BeforeEach
    void setUp() {
        solver = new GroupAnagrams();
    }

    @Test
    void test1() {
        var inputs = new String[]{"eat","tea","tan","ate","nat","bat"};

        var result = solver.solve(inputs);

        Assertions.assertThat(result).hasSize(3);
        Assertions.assertThat(result).contains(List.of("bat"));
        Assertions.assertThat(result).contains(List.of("tan", "nat"));
        Assertions.assertThat(result).contains(List.of("eat", "tea", "ate"));
    }

    @Test
    void test2() {
        var inputs = new String[]{""};

        var result = solver.solve(inputs);

        Assertions.assertThat(result).isEqualTo(
            List.of(List.of(""))
        );
    }

    @Test
    void test3() {
        var inputs = new String[]{"a"};

        var result = solver.solve(inputs);

        Assertions.assertThat(result).isEqualTo(
                List.of(List.of("a"))
        );
    }
}