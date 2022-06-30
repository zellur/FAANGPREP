package com.zrsys.leetcode.prob75;

import java.util.Arrays;

public class RunningSum {
    /*
    * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.
    Example 1:

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    * */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{1, 2, 3, 4})));
    }

    public int[] runningSum(int[] nums) {
        return runningSum(nums, 1);
    }

    public int[] runningSum(int[] nums, int curIndex) {
        if (curIndex == nums.length) {
            return nums;
        } else {
            nums[curIndex] = nums[curIndex] + nums[curIndex - 1];
        }
        return runningSum(nums, curIndex+1);
    }
}
