package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.solutions.MaximumDepthBinaryTree.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        var result = solver.solve(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var root = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );

        var result = solver.solve(root);

        Assertions.assertThat(result).isEqualTo(2);
    }

}