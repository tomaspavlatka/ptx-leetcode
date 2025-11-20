package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LevelOrderTraversalTest {
    LevelOrderTraversal solver;

    @BeforeEach
    void setUp() {
        solver = new LevelOrderTraversal();
    }

    @Test
    void test1() {
        var note = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        var result = solver.withMap(note);

        var expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        var note = new TreeNode(1);
        var result = solver.withMap(note);

        var expected = List.of(List.of(1));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test3() {
        var result = solver.withMap(null);

        assertThat(result).isEmpty();
    }

    @Test
    void test4() {
        var note = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        var result = solver.levelOrder(note);

        var expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test5() {
        var note = new TreeNode(1);
        var result = solver.levelOrder(note);

        var expected = List.of(List.of(1));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test6() {
        var result = solver.levelOrder(null);

        assertThat(result).isEmpty();
    }
}