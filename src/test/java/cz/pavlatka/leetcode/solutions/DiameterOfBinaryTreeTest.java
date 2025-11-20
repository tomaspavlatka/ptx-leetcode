package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree solver;

    @BeforeEach
    void setUp() {
        solver = new DiameterOfBinaryTree();
    }

    @Test
    void test1() {
        var root = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)), null),
                null
        );
        var result = solver.diameterOfBinaryTree(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var root = new TreeNode(
                1,
                new TreeNode(2, null, null),
                null
        );
        var result = solver.diameterOfBinaryTree(root);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() {
        var root = new TreeNode(
                1,
                new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(6)), null),
                null
        );
        var result = solver.diameterOfBinaryTree(root);

        Assertions.assertThat(result).isEqualTo(2);
    }
}