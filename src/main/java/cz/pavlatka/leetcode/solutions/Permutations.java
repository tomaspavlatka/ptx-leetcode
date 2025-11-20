package cz.pavlatka.leetcode.solutions;

import java.util.*;

// @see https://leetcode.com/problems/permutations/description/
public class Permutations {
    // Time: O(n x n!)
    // Space: O(n)
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return List.of();
        }

        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new LinkedHashSet<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, Set<Integer> path, int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (path.contains(num)) {
                continue;
            }

            path.add(num);
            backtrack(result, path, nums);
            path.remove(num);
        }
    }
}
