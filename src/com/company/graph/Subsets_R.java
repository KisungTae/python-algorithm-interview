package com.company.graph;

import java.util.ArrayList;
import java.util.List;

public class Subsets_R {

    // only faster than 63% of java submission, review and redo it

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<Integer>());
        for (int num : nums) {

            int size = results.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSet = new ArrayList<>();
                for (Integer element : results.get(i)) {
                    newSet.add(element);
                }
                newSet.add(num);
                results.add(newSet);
            }
        }

        return results;
    }
}
