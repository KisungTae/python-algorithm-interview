package com.company.array;

import java.util.Arrays;

public class ArrayPartitionOne_R {

    // I answered the problem but reminds me of it because it is not easy to thank of the solution at first



















    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int max = 0;

        for (int i = 0; i < nums.length; i += 2) {
            max += nums[i];
        }
        return max;
    }
}
