package com.company.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Permutations_R {

    // could not solve the problem with graph
    // it's only faster than 5%


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        LinkedHashSet set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        createPermutations(results, temp, set, nums);
        return results;
    }

    private void createPermutations(List<List<Integer>> results, List<Integer> temp, LinkedHashSet set, int[] nums) {
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        }


        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Integer val = Integer.parseInt(itr.next().toString());
            LinkedHashSet newSet = new LinkedHashSet<>();
            newSet = (LinkedHashSet)set.clone();
            newSet.remove(val);
            temp.add(val);
            createPermutations(results, temp, newSet, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
