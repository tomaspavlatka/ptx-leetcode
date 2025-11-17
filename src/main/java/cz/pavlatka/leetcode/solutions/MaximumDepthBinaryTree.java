package cz.pavlatka.leetcode.solutions;

import java.util.Stack;

// @see https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthBinaryTree {
    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var stack = new Stack<NodeDepth>();
        stack.push(new NodeDepth(root, 1));

        var maxDepth = 0;
        while (!stack.isEmpty()) {
            var nodeDepth = stack.pop();
            var node = nodeDepth.node;
            var depth = nodeDepth.depth;

            maxDepth = Math.max(maxDepth, depth);
            if (node.left != null) {
                stack.push(new NodeDepth(node.left, depth + 1));
            }

            if (node.right != null) {
                stack.push(new NodeDepth(node.right, depth + 1));
            }
        }

        return maxDepth;
    }

    public static class NodeDepth {
        int depth;
        TreeNode node;

        NodeDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
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
