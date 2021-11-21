package com.company.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_R {

    // I solved the problem, but not completely understand my logic, did not see the answer yet


















    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> indices = new HashMap<>();

        int max = 0;
        int count = 0;
        int lastDuplicateIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (indices.containsKey(ch)) {
                int index = indices.get(ch);

                if (index < lastDuplicateIndex) {
                    indices.put(ch, i);
                    count++;
                    continue;
                }


                if (count > max)
                    max = count;


                count = i - index;
                indices.put(ch, i);
                lastDuplicateIndex = index;

            } else {
                indices.put(ch, i);
                count++;
            }
        }

        if (count > max)
            max = count;

        return max;
    }
}
