package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

// @see https://leetcode.com/problems/subsets/description/
public class SubSet {
    // Time: O(n)
    // Space: O(n)
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0)  {
            return List.of();
        }

        var result = new ArrayList<List<Integer>>();
        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, int start, ArrayList<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i+1, path, result);
            path.removeLast();
        }
    }
}
