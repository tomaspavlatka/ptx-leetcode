package cz.pavlatka.leetcode.solutions;

import java.util.*;

// @see https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {
    public int[] bruteForce(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new int[]{};
        }

        var map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            var counter = map.getOrDefault(num, 0);
            counter += 1;
            map.put(num, counter);
        }

        var win = new ArrayList<Integer>();
        var seen = new HashSet<>();
        while (win.size() < k) {
            var max = map.values().stream().filter(v -> !seen.contains(v)).sorted(Comparator.reverseOrder()).toList().getFirst();
            var elements = map.entrySet().stream()
                    .filter(e -> e.getValue().equals(max)).map(Map.Entry::getKey).toList();

            seen.add(max);
            win.addAll(elements);
        }

        return win.stream().mapToInt(i -> i).toArray();
    }
}
