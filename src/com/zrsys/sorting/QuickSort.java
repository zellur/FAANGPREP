package com.zrsys.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] n = new int[] {4,7,5,3,8};
        System.out.println(Arrays.toString(sort(0, n.length - 1, n)));
    }

    public static int[] sort(int leftIndex, int rightIndex, int[] arr){

        if (leftIndex >= rightIndex) return arr;

        int pivot = arr[rightIndex];
        int leftPosition = leftIndex;
        int rightPosition = rightIndex;

        while(true) {
            while (arr[leftPosition] <= pivot && leftPosition < rightPosition) {
                leftPosition++;
            }
            while (arr[rightPosition] >= pivot && leftPosition < rightPosition) {
                rightPosition--;
            }
            if (leftPosition >= rightPosition) break;

            swap(leftPosition, rightPosition, arr);
        }
        swap(leftPosition, rightIndex, arr);

        sort(leftIndex, leftPosition-1, arr);
        sort(leftPosition+1, rightIndex, arr);

        return arr;
    }


    private static void swap(int pos1, int pos2, int[] arr) {
        var tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
