package com.zrsys.Codeforces.SIT;

import java.util.Scanner;

public class Crunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int i = 0;
        while (i < n) {
            data[i] = sc.nextInt();
            i++;
        }

        int max = 0;
        for (int j =0; j < data.length; j++) {
            int sum = 0;
            int count = 0;
            for (int k = j; k < data.length; k++) {
                sum += data[k];
                count++;
                if (sum > 100 * (count)) {
                    max = Math.max(max, count);
                }
            }
        }
        System.out.println(max);
    }

    //
}
