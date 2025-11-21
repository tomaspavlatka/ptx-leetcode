package cz.pavlatka.practice;

import cz.pavlatka.leetcode.shared.TreeNode;
import cz.pavlatka.leetcode.shared.TreeNodeDepth;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ShortestPath {

    // Time: O(n) - may need to visit all nodes
    // Space: O(n) - maximum width of the tree
    public int bfs(TreeNode root) {
        if (root == null) {
            return -1;
        }

        var queue = new ArrayDeque<TreeNodeDepth>();
        queue.add(new TreeNodeDepth(root, 0));

        while(!queue.isEmpty()) { // O(h)
            var node = queue.poll();
            if (node.node.val == 3) {
                return node.depth;
            }

            if (node.node.left != null) {
                queue.add(new TreeNodeDepth(node.node.left, node.depth + 1));
            }

            if (node.node.right != null) {
                queue.add(new TreeNodeDepth(node.node.right, node.depth + 1));
            }
        }

        return -1;
    }

    // Time: O(n) - may need to visit all nodes
    // Space: O(h) - maximum depth of the tree
    public List<List<Integer>> dfs(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        var paths = new ArrayList<List<Integer>>();
        doDfs(root, new ArrayList<>(), paths);

        return paths;
    }

    private void doDfs(TreeNode node, List<Integer> path, List<List<Integer>> results) {
        if (node == null) {
            return;
        }

        path.add(node.val);

        if (node.val == 3) {
            results.add(new ArrayList<>(path));
        } else {
            doDfs(node.left, path, results);
            doDfs(node.right, path, results);
        }

        path.removeLast();
    }
}
