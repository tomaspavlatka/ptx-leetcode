package cz.pavlatka.practice;

import cz.pavlatka.leetcode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestPathTest {

    ShortestPath solver;

    @BeforeEach
    void setUp() {
        solver = new ShortestPath();
    }

    @Test
    void test1() {
        var result = solver.bfs(null);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test2() {
        var root = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(5, new TreeNode(6, new TreeNode(7, new TreeNode(3), null), null), null), null)
        );
        var result = solver.bfs(root);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        var result = solver.dfs(null);
        assertThat(result).isEmpty();
    }

    @Test
    void test4() {
        var root = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(5, new TreeNode(6, new TreeNode(7, new TreeNode(3), null), null), null), null)
        );
        var result = solver.dfs(root);

        var expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 4, 5, 6, 7, 3)
        );
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}