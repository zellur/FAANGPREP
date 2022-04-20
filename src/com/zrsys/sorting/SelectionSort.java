package com.zrsys.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{4, 2, 7, 1, 12, 45, 0, 5})));
    }

    /*
    * {4, 2, 7, 1, 3}
    * */
    public static int[] sort(int[] arr) {
        int indexToSwap = 0;

        while (indexToSwap < arr.length) {
            int lowestIndex = indexToSwap;

            for (int i = indexToSwap+1; i < arr.length; i++) {
                if (arr[lowestIndex] > arr[i]) {
                    lowestIndex = i;
                }
            }
            var tmp = arr[indexToSwap];
            arr[indexToSwap] = arr[lowestIndex];
            arr[lowestIndex] = tmp;
            indexToSwap++;

        }
        return arr;
    }
}
