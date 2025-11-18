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
            map.put(num, map.getOrDefault(num, 0) + 1);
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

    public int[] buckets(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new int[]{};
        }

        var map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        var groups = new HashMap<Integer, List<Integer>>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            groups.computeIfAbsent(entry.getValue(), i -> new ArrayList<>()).add(entry.getKey());
        }

        var list = groups.keySet().stream().sorted().toList();
        var res = new ArrayList<Integer>();
        for (int pos = list.size() - 1; pos >= 0 && res.size() < k; pos -= 1) {
            res.addAll(groups.get(list.get(pos)));
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public int[] bucketOn(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new int[]{};
        }

        var map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (bucket[entry.getValue()] == null) {
                bucket[entry.getValue()] = new ArrayList<>();
            }

            bucket[entry.getValue()].add(entry.getKey());
        }

        var res = new ArrayList<Integer>();
        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos -= 1) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
