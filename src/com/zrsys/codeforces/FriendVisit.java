package com.zrsys.codeforces;

import java.util.Scanner;

public class FriendVisit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finL = sc.nextInt();
        int shopL = sc.nextInt();
        int levL = sc.nextInt();

        System.out.println(Math.abs(finL - shopL) + Math.abs(shopL - levL));
    }
}
