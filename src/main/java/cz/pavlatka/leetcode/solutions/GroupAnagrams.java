package cz.pavlatka.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// @see https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {
    public List<List<String>> solve(String[] strs) {
        if (strs.length == 0) {
            return List.of();
        }

        var map = new HashMap<Integer, List<String>>();
        for (var str: strs) {
            var chars = str.toCharArray();

            var weight = 0;
            for (var c : chars) {
                weight += c;
            }

            map.computeIfAbsent(weight, k -> new ArrayList<>()).add(str);
        }

       return map.values().stream().toList();
    }
}
