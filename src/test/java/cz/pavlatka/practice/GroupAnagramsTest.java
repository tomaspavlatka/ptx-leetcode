package cz.pavlatka.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {
    GroupAnagrams solver;

    @BeforeEach
    void setUp() {
        solver = new GroupAnagrams();
    }

    @Test
    void test1() {
        var result = solver.group(List.of("eat","tea","tan","ate","nat","bat"));

        var expected = List.of(
                List.of("eat","tea","ate"),
                List.of("tan","nat"),
                List.of("bat")
        );

        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        var result = solver.group(List.of("ad", "bc"));

        var expected = List.of(
                List.of("ad"),
                List.of("bc")
        );

        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}