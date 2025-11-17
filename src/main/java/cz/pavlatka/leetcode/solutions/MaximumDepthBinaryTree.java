package cz.pavlatka.leetcode.solutions;

import java.util.LinkedList;

// @see https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthBinaryTree {
    private int maxDepth;

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        calculateMaxDepth(root, 1);

        return maxDepth;
    }

    private void calculateMaxDepth(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        maxDepth = Math.max(maxDepth, depth);

        calculateMaxDepth(node.left, depth + 1);
        calculateMaxDepth(node.right, depth + 1);
    }

    public int bfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var queue = new LinkedList<NodeDepth>();
        queue.offer(new NodeDepth(root, 1));

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            var nodeDepth = queue.poll();

            maxDepth = Math.max(maxDepth, nodeDepth.depth);

            if (nodeDepth.node.left != null) {
                queue.offer(new NodeDepth(nodeDepth.node.left, nodeDepth.depth + 1));
            }

            if (nodeDepth.node.right != null) {
                queue.offer(new NodeDepth(nodeDepth.node.right, nodeDepth.depth + 1));
            }
        }

        return maxDepth;
    }

    static class NodeDepth {
        int depth;
        TreeNode node;
        NodeDepth(TreeNode node, int depth) {
            this.depth = depth;
            this.node = node;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
