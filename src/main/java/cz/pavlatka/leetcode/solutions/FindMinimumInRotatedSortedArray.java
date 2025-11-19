package cz.pavlatka.leetcode.solutions;

// @see https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimumInRotatedSortedArray {
    // Time: O(long n)
    // Space: O(1)
    public int solve(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        var left = 0;
        var right = nums.length - 1;

        while (left < right) {
            var mid = left + (right - left)  / 2;

            if (nums[mid] > nums[right]) { // the right seems to be sorted and then it can't contain the smallest one
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
