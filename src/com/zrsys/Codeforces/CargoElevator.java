package com.zrsys.Codeforces;

import java.util.Scanner;

public class CargoElevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val, hCount = 0, fCount = 0;
        while (n > 0) {
            val = sc.nextInt();
            if (val == 50) {
                fCount++;
            } else {
                hCount++;
            }
            n--;
        }
        if (hCount >= fCount) {
            System.out.println(hCount);
        } else {
            int v = (fCount - hCount)/3;
            int m = (fCount - hCount)%3;
            System.out.println(hCount + v + (m > 0 ? 1 : 0) );
        }
    }
}
