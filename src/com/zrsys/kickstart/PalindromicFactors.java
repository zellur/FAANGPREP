package com.zrsys.kickstart;

import java.util.Scanner;
/*
* 4
6
10
144
242

* */
public class PalindromicFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int count = 0;
            int v = sc.nextInt();
            for (int i = 1; i <= v; i++) {
                int f = v % i;
                if (f != 0) continue;
                if (isPalindrome(v / i)) {
                    count++;
                };
            }
            System.out.println(count);
            t--;
        }
    }

    static boolean isPalindrome(int n) {
        int ret = 0;
        int retc = n;

        while (n > 0) {
            int rem = n % 10;
            ret = rem + (ret * 10);
            n /= 10;
        }
        return ret == retc;
    }
}
