package cz.pavlatka.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

// @see https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/
public class MaximumDepthOfNAryTree {
    // Time: 0(n log n) -- because of sorting
    // Space: O(1)h
    public int recursion(Node root) {
        if (root == null) {
            return 0;
        }

        return countDepthSort(root, 1);
    }

    private int countDepthSort(Node node, int depth) {
        if (node.children == null || node.children.isEmpty()) {
            return depth;
        }

        return node.children.stream().map(child -> countDepthSort(child, depth + 1)).sorted().toList().reversed().getFirst();
    }

    // Time: 0(n)
    // Space: O(1)h
    public int dfs(Node root) {
        if (root == null) {
            return 0;
        }

        return countDepth(root, 1);
    }

    // Time: 0(n)
    // Space: O(1)h
    public int bfs(Node root) {
        if (root == null) {
            return 0;
        }

        var depth = 0;
        var stack = new LinkedList<NodeDepth>();
        stack.offer(new NodeDepth(root, 1));
        while (!stack.isEmpty()) {
            var c = stack.poll();
            if (c.node.children != null) {
                for (Node child : c.node.children) {
                    stack.offer(new NodeDepth(child, c.depth+1));
                }
            }

            depth = Math.max(depth, c.depth);
        }

        return depth;
    }

    private record  NodeDepth(Node node, int depth) {}

    private int countDepth(Node node, int depth) {
        if (node.children == null || node.children.isEmpty()) {
            return depth;
        }

        var max = depth;
        for (var child : node.children) {
            max = Math.max(max, countDepth(child, depth + 1));
        }

        return max;
    }

    public static class Node {
        public int val;
        public List<Node> children;

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
