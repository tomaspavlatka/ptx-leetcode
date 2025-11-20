package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;

public class DiameterOfBinaryTree {
    private int diameter = 0;

    // Time: O(n)
    // Space: 0(1)
    public int diameterOfBinaryTree(TreeNode root) {
        countDepth(root);
        return diameter;
    }

    private int countDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        var left = countDepth(node.left);
        var right = countDepth(node.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
