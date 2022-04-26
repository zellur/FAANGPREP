package com.zrsys.search;

public class BinarySearch {

    /*
    * 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
    * */

    static int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    public static void main(String[] args) {
        System.out.println(binarySearch(16));
    }

    /*
    * return the index of value
    * */
    public static int binarySearch(int v) {
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < v ) {
                first = mid + 1;
            } else if (arr[mid] == v) {
                return mid;
            } else {
                last = mid - 1;
            }
         mid = (first + last) / 2;
        }
        return -1;
    }
}
