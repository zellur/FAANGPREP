package com.zrsys.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class WaterTheTrees {

    //5
    //4 4 3 5 5
    // 7
    //2 5 4 8 3 7 4
    // 7
    //1 1 1 1 1 1 2 => 1 1 1 1 1 1 3 => 1 1 1 1 1 3 3 => 1 1 1 1 2 3 3 => 1 1 1 3 2 3 3 => 1 1 1 3 3 3 3 => 1 1 3 3 3 3 3 => 1 2 3 3 3 3 3 => 3 2 3 3 3 3 3 => 3 3 3 3 3 3 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testArr1 = new int[0];
        while (t > 0) {
            int n = sc.nextInt();
            testArr1 = new int[n];
            for (int i = 0; i < n; i++) {
                testArr1[i] = Integer.parseInt(sc.next());
            }
            int tVal = Arrays.stream(testArr1).max().getAsInt();
            System.out.println(getMinNumberOfDay(testArr1, tVal));
            t--;
            if (t == 0) break;
        }
    }

    public static int getMinNumberOfDay(int[] arr, int tVal) {
        int day = 1;
        while (true) {
            int c = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] >= tVal) {
                   c++;
                   if (c == arr.length) return day-1;
                   continue;
               }
               if (arr[i] < tVal) {
                   if (day % 2 == 1) {
                       if (tVal - arr[i] != 2)  {
                           arr[i] = arr[i] + 1;
                           break;
                       }
                   } else {
                       if (arr[i] + 2 <= tVal) {
                           arr[i] = arr[i] + 2;
                           break;
                       }
                   }
               }
           }
            day++;
        }
    }
}
