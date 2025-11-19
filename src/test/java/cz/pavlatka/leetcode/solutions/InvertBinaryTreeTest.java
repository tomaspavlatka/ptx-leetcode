package cz.pavlatka.leetcode.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cz.pavlatka.leetcode.solutions.InvertBinaryTree.*;
import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {

    InvertBinaryTree solver;

    @BeforeEach
    void setUp() {
        solver = new InvertBinaryTree();
    }

    @Test
    void test0() {
        var result = solver.invertTree(null);
        assertThat(result).isNull();
    }

    @Test
    void test4() {
        var root = new TreeNode(
                1,
                new TreeNode(2),
                null
        );

        var result = solver.invertTree(root);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.left).isNull();
        assertThat(result.right).isNotNull();
        assertThat(result.right.val).isEqualTo(2);
    }

    @Test
    void test5() {
        var root = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );

        var result = solver.invertTree(root);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.left).isNotNull();
        assertThat(result.left.val).isEqualTo(2);
        assertThat(result.right).isNull();
    }

    @Test
    void test6() {
        var root = new TreeNode(
                1,
                null,
                new TreeNode(2, new TreeNode(3), new TreeNode(6))
        );

        var result = solver.invertTree(root);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.left).isNotNull();
        assertThat(result.left.val).isEqualTo(2);
        assertThat(result.left.left).isNotNull();
        assertThat(result.left.left.val).isEqualTo(6);
        assertThat(result.left.right).isNotNull();
        assertThat(result.left.right.val).isEqualTo(3);
        assertThat(result.right).isNull();
    }

}