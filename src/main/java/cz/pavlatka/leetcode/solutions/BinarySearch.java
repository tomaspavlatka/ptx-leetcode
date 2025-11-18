package cz.pavlatka.leetcode.solutions;

public class BinarySearch {
    // Time: O log n
    // Space: O(1)
    public int solve(int[] nums, int target) {
        var low = 0;
        var high = nums.length - 1;

        while (low <= high) { // 0(log n)
            var mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
