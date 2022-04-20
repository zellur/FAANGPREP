package com.zrsys.Codeforces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String word = sc.next();
            if (word.length() > 10) {
                word = word.substring(0,1).concat(word.substring(1, word.length() - 1).length()+"").concat(word.substring(word.length()-1));
            }
            System.out.println(word);
            t--;
        }
    }
}
