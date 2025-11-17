package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSums {

    public int[] solve(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var idx = map.get(nums[i]);
            if (idx != null) {
                return new int[]{idx, i};
            } else {
                map.put(target - nums[i], i);
            }
        }

        return new int[]{};
    }
}
