package com.zrsys.leetcode.algorithm;

public class BinaryTree {
    /*
     * Given an array of integers nums which is sorted in ascending order, and an integer target,
     *  write a function to search target in nums. If target exists,
     * then return its index. Otherwise, return -1.
     * You must write an algorithm with O(log n) runtime complexity.  nums = [-1,0,3,5,9,12], target = 9
     * */

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        while (high >= low) {
            if (nums[mid] < target) {
                low = mid+1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                high = mid-1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

}
