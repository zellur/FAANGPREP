package com.zrsys.Codeforces.SIT;

import java.util.Scanner;

public class MobileInternetPackage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int p = sc.nextInt();

        if (p <= s) {
            System.out.println(c1);
        } else {
            int v = p-s;
            System.out.println((v * c2) + c1) ;
        }

    }
}
