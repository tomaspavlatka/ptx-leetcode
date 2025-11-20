package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;
import cz.pavlatka.leetcode.shared.TreeNodeDepth;

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

        var queue = new LinkedList<TreeNodeDepth>();
        queue.offer(new TreeNodeDepth(root, 1));

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            var nodeDepth = queue.poll();

            maxDepth = Math.max(maxDepth, nodeDepth.depth);

            if (nodeDepth.node.left != null) {
                queue.offer(new TreeNodeDepth(nodeDepth.node.left, nodeDepth.depth + 1));
            }

            if (nodeDepth.node.right != null) {
                queue.offer(new TreeNodeDepth(nodeDepth.node.right, nodeDepth.depth + 1));
            }
        }

        return maxDepth;
    }
}
