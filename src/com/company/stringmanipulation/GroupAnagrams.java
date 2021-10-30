package com.company.stringmanipulation;

import java.util.*;

public class GroupAnagrams {
    public GroupAnagrams() {
        Map<String, String> map = new HashMap<>();


    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String orderedStr = String.valueOf(arr);
            List<String> list = anagrams.getOrDefault(orderedStr, new ArrayList<>());
            list.add(str);
            anagrams.put(orderedStr, list);
        }

        List<List<String>> results = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
            results.add(entry.getValue());
        }


        return results;
    }
}
