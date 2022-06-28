package com.zrsys.codeforces;

import java.util.Scanner;

public class BuzzProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int curIndex = 2;
        int sum = x;
        while (curIndex <= n) {
            if (curIndex % 5 != 0) {
                sum = sum + (x+1);
                x = x+1;
            } else {
                sum = sum + (x-2);
                x = x-2;
            }
            curIndex++;
        }
        System.out.println(sum);
    }
}
