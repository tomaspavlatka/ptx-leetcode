package cz.pavlatka.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> group(List<String> candidates) {

        var map = new HashMap<String, List<String>>();
        for (String candidate : candidates) {
            var chars = candidate.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(candidate);
        }

        return map.values().stream().toList();
    }
}
