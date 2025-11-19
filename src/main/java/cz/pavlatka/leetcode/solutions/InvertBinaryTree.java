package cz.pavlatka.leetcode.solutions;

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
