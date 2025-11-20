package cz.pavlatka.leetcode.shared;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this(val, null, null);
    }
}
