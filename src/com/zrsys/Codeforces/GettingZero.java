package com.zrsys.Codeforces;

import java.util.Scanner;

public class GettingZero {

    /*
    * Suppose you have an integer v. In one operation, you can:

either set v=(v+1)mod32768
or set v=(2⋅v)mod32768.
You are given n integers a1,a2,…,an. What is the minimum number of operations you need to make each ai equal to 0?

Input
The first line contains the single integer n (1≤n≤32768) — the number of integers.

The second line contains n integers a1,a2,…,an (0≤ai<32768).

Output
Print n integers. The i-th integer should be equal to the minimum number of operations required to make ai equal to 0.
*
* 19 32764 10240 49 26670 20516 29501 18299
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numToTest = sc.nextInt();
            System.out.println(step(numToTest));
        }
    }

    public static int step(int num) {
        if (num * 2 >= 32768) {
            int step = 32768 - num;
            num = (num*2) - 32768;
            return Math.min(step(num), step);
        }
        int s1 = getStepByNum(num);
        int s2 = getStepByNum(num + 1) + 1;
        return Math.min(s1, s2);
    }

    static int getStepByNum(int num) {
        int step = 0;
        while (true) {
            num *= 2;
            step++;
            if (num % 32768 == 0) break;
        }
        return step;
    }
}
