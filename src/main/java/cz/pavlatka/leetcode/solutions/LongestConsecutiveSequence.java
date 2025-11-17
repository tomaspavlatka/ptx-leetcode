package cz.pavlatka.leetcode.solutions;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int solve(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                count++;
            } else if (nums[i] != nums[i-1]) {
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
