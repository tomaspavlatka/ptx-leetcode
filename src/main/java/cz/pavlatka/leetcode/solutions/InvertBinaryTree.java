package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;

// @see https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {
    // Time: O(n)
    // Space: O(n)
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }
}
