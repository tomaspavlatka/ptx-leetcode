package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;

// @see https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
    // Time: O(n^2)
    // Space: O(n)
    public int[] bruteForce(int[] nums) {
        var res = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            var sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    sum *= nums[j];
                }
            }

            res.add(sum);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    // Time: O(n^2)
    // Space: O(n)
    public int[] withMemmory(int[] nums) {
        var res = new ArrayList<Integer>();

        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(i, map.getOrDefault(i - 1, 1) * nums[i]);
            var sum = map.getOrDefault(i - 1, 1);
            for (int j = i + 1; j < nums.length; j++) {
                sum *= nums[j];
            }

            res.add(sum);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    // Time O(n)
    // Space O(1)
    public int[] withSuffix(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffix *= nums[i];
            res[i] = suffix;
        }

        return res;
    }
}
