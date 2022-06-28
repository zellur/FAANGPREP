package com.zrsys.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer cVal = indexMap.get(target-nums[i]);
            if (cVal != null) return new int[] {cVal, i};
            indexMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
