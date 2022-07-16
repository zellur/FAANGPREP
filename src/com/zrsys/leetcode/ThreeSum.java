package com.zrsys.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    /*
    * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
    * and nums[i] + nums[j] + nums[k] == 0.
    * Notice that the solution set must not contain duplicate triplets.
    * */

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>();
        List<Integer> tripLets;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    tripLets = new ArrayList<>();
                    tripLets.add(nums[i]);
                    tripLets.add(nums[j]);
                    tripLets.add(nums[k]);

                    if (nums[i] + nums[j] + nums[k] == 0 && !isDuplicate(retList, tripLets)) {
                        retList.add(tripLets);
                    }
                }
            }
        }
        return retList;
    }

    boolean isDuplicate(List<List<Integer>> retList, List<Integer> list) {

        Collections.sort(list);
        return retList.stream()
                .map(x -> {Collections.sort(x); return x;})
                .anyMatch(x -> x.toString().equals(list.toString()));
    }
}
