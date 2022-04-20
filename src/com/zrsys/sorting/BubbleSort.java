package com.zrsys.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{9, 8, 7, 6, 10, 5, 4, 3, 2, 1})));
    }

    /*
    * {10,9,8,7,6,5,4,3,2,1}
    * */
    public static int[] sort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    sorted = false;
                    var tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        return arr;
    }

}
