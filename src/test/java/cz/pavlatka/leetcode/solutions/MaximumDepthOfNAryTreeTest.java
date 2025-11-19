package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.solutions.MaximumDepthOfNAryTree.Node;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MaximumDepthOfNAryTreeTest {

    MaximumDepthOfNAryTree solver;

    @BeforeEach
    void setUp() {
        solver = new MaximumDepthOfNAryTree();
    }

    @Test
    void test1() {
        var root = new Node(
                1,
                List.of(
                        new Node(3, List.of(new Node(5), new Node(6))),
                        new Node(2),
                        new Node(4)
                )
        );

        var result = solver.recursion(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        var root = new Node(
                1,
                List.of(
                        new Node(2),
                        new Node(3, List.of(new Node(6), new Node(6, List.of(new Node(11, List.of(new Node(14))))))),
                        new Node(4, List.of(new Node(8, List.of(new Node(12))))),
                        new Node(5, List.of(new Node(9, List.of(new Node(13))), new Node(10)))
                )
        );

        var result = solver.recursion(root);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void test3() {
        var root = new Node(
                1,
                List.of(
                        new Node(3, List.of(new Node(5), new Node(6))),
                        new Node(2),
                        new Node(4)
                )
        );

        var result = solver.dfs(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test4() {
        var root = new Node(
                1,
                List.of(
                        new Node(2),
                        new Node(3, List.of(new Node(6), new Node(6, List.of(new Node(11, List.of(new Node(14))))))),
                        new Node(4, List.of(new Node(8, List.of(new Node(12))))),
                        new Node(5, List.of(new Node(9, List.of(new Node(13))), new Node(10)))
                )
        );

        var result = solver.dfs(root);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void test5() {
        var root = new Node(
                1,
                List.of(
                        new Node(3, List.of(new Node(5), new Node(6))),
                        new Node(2),
                        new Node(4)
                )
        );

        var result = solver.bfs(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void test6() {
        var root = new Node(
                1,
                List.of(
                        new Node(2),
                        new Node(3, List.of(new Node(6), new Node(6, List.of(new Node(11, List.of(new Node(14))))))),
                        new Node(4, List.of(new Node(8, List.of(new Node(12))))),
                        new Node(5, List.of(new Node(9, List.of(new Node(13))), new Node(10)))
                )
        );

        var result = solver.bfs(root);

        Assertions.assertThat(result).isEqualTo(5);
    }
}