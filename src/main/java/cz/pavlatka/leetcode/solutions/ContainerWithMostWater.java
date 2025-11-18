package cz.pavlatka.leetcode.solutions;

// @see https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    // Time: O(n^2)
    // Space: O(1)
    public int bruteForce(int[] height) {
        var max = 0;

        for (int i = 0; i < height.length - 1; i++) { // O(n)
            for (int j = i + 1; j < height.length; j++) { // O(n)
                var res = Math.min(height[i], height[j]) * (j - i); // 0(1);
                max = Math.max(max, res);
            }
        }

        return max;
    }

    // Time: O(n)
    // Space: O(1)
    public int improved(int[] height) {
        var max = 0;

        var left = 0;
        var right = height.length - 1;
        while (left < right) { // O(n)
            max = Math.max(max, (right - left) * Math.min(height[left], height[right])); // O(1)
            if (height[left] < height[right]) { // We want to find the container with most water, therefore he keep the higher number
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
