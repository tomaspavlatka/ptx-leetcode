package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumDepthBinaryTreeTest {
    MaximumDepthBinaryTree solver;

    @BeforeEach
    void setUp() {
        solver = new MaximumDepthBinaryTree();
    }

    @Test
    void test1() {
        var root = new TreeNode(
                3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        var result = solver.bfs(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var root = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );

        var result = solver.bfs(root);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        var root = new TreeNode(
                3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        var result = solver.dfs(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test4() {
        var root = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );

        var result = solver.dfs(root);

        Assertions.assertThat(result).isEqualTo(2);
    }
}