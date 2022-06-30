package com.zrsys.leetcode.prob75;

import java.util.Arrays;

public class FindPivotIndex {

    /*
    * Given an array of integers nums, calculate the pivot index of this array.

    The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

    If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

    Return the leftmost pivot index. If no such index exists, return -1.
    * */

    public static void main(String[] args) {
        System.out.println(new FindPivotIndex().pivotIndex(new int[]{2,1,-1}));
    }

    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) return i;
            leftSum+= nums[i];
        }
        return -1;
    }

}
