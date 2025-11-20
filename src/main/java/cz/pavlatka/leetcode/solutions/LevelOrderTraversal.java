package cz.pavlatka.leetcode.solutions;

import cz.pavlatka.leetcode.shared.TreeNode;
import cz.pavlatka.leetcode.shared.TreeNodeDepth;

import java.util.*;

// @see https://leetcode.com/problems/binary-tree-level-order-traversal/
public class LevelOrderTraversal {
    // Time: O(n)
    // Space: 0(n)
    public List<List<Integer>> withMap(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        var map = new TreeMap<Integer, List<Integer>>();
        var stack = new LinkedList<TreeNodeDepth>();
        stack.offer(new TreeNodeDepth(root, 0));

        while (!stack.isEmpty()) { // O(n)
            var node = stack.poll();
            map.computeIfAbsent(node.depth, k -> new ArrayList<>()).add(node.node.val);

            if (node.node.left != null) {
                stack.offer(new TreeNodeDepth(node.node.left, node.depth + 1));
            }

            if (node.node.right != null) {
                stack.offer(new TreeNodeDepth(node.node.right, node.depth + 1));
            }
        }

        return map.values().stream().toList();
    }

    // Time: O(n)
    // Space: 0(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        var stack = new LinkedList<TreeNode>();
        stack.offer(root);

        var result = new ArrayList<List<Integer>>();

        while (!stack.isEmpty()) { // O(n)
            var size = stack.size();
            var level = new ArrayList<Integer>(size);

            for (int i = 0; i < size; i++) {
                var node = stack.poll();
                level.add(node.val);

                if (node.left != null) {
                    stack.offer(node.left);
                }

                if (node.right != null) {
                    stack.offer(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}
