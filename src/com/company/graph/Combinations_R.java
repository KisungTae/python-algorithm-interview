package com.company.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations_R {

    // could not solve the problem with graph
    // sovled the problem but think about not to go through i = 4 because it's not promising

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        createCombinations(1, n, 0, results, new Integer[k]);
        return results;
    }

    private void createCombinations(int start, int end, int index, List<List<Integer>> results, Integer[] decisions) {
        if (index == decisions.length) {
            results.add(new ArrayList<>(Arrays.asList(decisions)));
            return;
        }


        for (int i = start; i <= end; i++) {
            decisions[index] = i;
            createCombinations(i + 1, end, index + 1, results, decisions);
        }
    }
}
