package com.zrsys.codeforces.SIT;

import java.util.Scanner;
import java.util.stream.IntStream;

public class HappyIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inVal = sc.next();
        if (inVal.charAt(0) == '0') {
            System.out.println(0);
            return;
        }

        int num = Integer.parseInt(inVal);

        System.out.println(IntStream.rangeClosed(1, num)
                .filter(x -> isHappy(String.valueOf(x)))
                .count());
    }

    private static boolean isHappy(String val) {
        char cur = '0';
        for (char c : val.toCharArray()) {
            if (c < cur) return false;
            cur = c;
        }
        return true;
    }
}
