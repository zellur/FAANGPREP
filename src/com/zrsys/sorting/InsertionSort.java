package com.zrsys.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{4, 2, 7, 6, 5})));
    }

    /*
    * e.g -> {4,2,7,6,5}
    * */
    public static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int position = i;

            while (position > 0 && arr[position] < arr[position - 1]) {
                var tmp = arr[position - 1];
                arr[position - 1] = arr[position];
                arr[position] = tmp;
                position--;
            }
        }
        return arr;
    }
}
