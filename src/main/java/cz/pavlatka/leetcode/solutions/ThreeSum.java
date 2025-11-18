package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// @see https://leetcode.com/problems/3sum/
public class ThreeSum {
    // Time: O(n^3)
    // Space: O(n^3)
    public List<List<Integer>> bruteForce(int[] nums) {
        var result = new ArrayList<List<Integer>>(); // O(n)

        for (int i = 0; i < nums.length; i++) { // O(n) -> O(n^3)
            for (int j = i + 1; j < nums.length; j++) { // O(n)
                for (int k = j + 1; k < nums.length; k++) { // O(n)
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }

            }
        }

        return result.stream().map(inner -> inner.stream().sorted().toList())
                .collect(Collectors.toSet()).stream().toList(); // O(n^3)
    }

    // Time: O(n^2)
    // Space: O(n log n)
    public List<List<Integer>> improved(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums); // O(n log n)

        for (int i = 0; i < nums.length - 2; i++) { // O(n)
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            var low = i + 1;
            var high = nums.length - 1;
            var sum = -nums[i];

            while (low < high) { // O(n)
                var data = nums[low] + nums[high];
                if (data == sum) {
                    result.add(List.of(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                } else if (data > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }
}
