package com.company.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum_R {

// your first solution was correct but different from the answer from the book, re-do it!























    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            indices.put(curr, i);
        }

        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int diff = target - curr;
            if (indices.containsKey(diff)) {
                int index = indices.get(diff);
                if (i == index) continue;

                results[0] = i;
                results[1] = indices.get(diff);
                break;
            }

        }


        return results;
    }
}
