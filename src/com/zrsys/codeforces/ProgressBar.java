package com.zrsys.codeforces;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProgressBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();

        t = BigDecimal.valueOf((long) n * k).divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(t)).intValue();
        while (n > 0) {
            if (t >= k) {
                System.out.print(k);
            } else {
                System.out.print(Math.max(t, 0));
            }
            System.out.print(" ");
            t -= k;
            n--;
        }
    }
}
