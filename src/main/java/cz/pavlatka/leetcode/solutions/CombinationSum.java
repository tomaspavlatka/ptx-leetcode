package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

// @see https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
    private List<List<Integer>> result = new ArrayList<>();
    // Time:
    // Space:
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, new ArrayList<>(), 0, target, candidates);
        return result;
    }

    private void backtrack(int start, List<Integer> path, int total, int target, int[] candidates) {
        if (total == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (start > candidates.length - 1 || total > target) {
            return;
        }

        path.add(candidates[start]);
        backtrack(start, path, total + candidates[start], target, candidates);
        path.remove(path.size() - 1);

        backtrack(start + 1, path, total, target, candidates);
    }
}
