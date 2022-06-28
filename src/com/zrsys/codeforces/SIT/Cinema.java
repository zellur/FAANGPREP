package com.zrsys.codeforces.SIT;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int maxCap = Math.max(a, b);
        int maxP = Math.max(c, d);

        int minCap = Math.min(a, b);
        int minP = Math.min(c, d);

        if (maxP > maxCap){
            System.out.println("NO");
            return;
        }

        if (minP > minCap && minP > (maxCap - maxP)) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
