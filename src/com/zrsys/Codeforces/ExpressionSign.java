package com.zrsys.Codeforces;

import java.util.Scanner;

public class ExpressionSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double val = Math.pow(a,b);
        if (val == 0) {
            System.out.println(0);
        } else {
            System.out.println(val < 1 ? -1 : 1);
        }
    }
}
