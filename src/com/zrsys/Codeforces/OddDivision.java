package com.zrsys.Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class OddDivision {

    /*
    * 1317819
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputVal = sc.next();
        int count = 0;
        String cVal;
        int v = 1;


//        while (inputVal.length() > 0) {
//            if (v > inputVal.length()) {
//                count = -1;
//                break;
//            }
//            cVal = inputVal.substring(0,v);
//
//            if (cVal.charAt(0) == '0' || new BigInteger(cVal).longValue() == 0 || new BigInteger(cVal).remainder(BigInteger.TWO).longValue() == 0) {
//                v++;
//            } else {
//                if (v == inputVal.length() || inputVal.charAt(v) != '0') {
//                    count++;
//                    inputVal = inputVal.substring(v);
//                    v = 1;
//                } else {
//                    v++;
//                }
//            }
//        }
        System.out.println(getVal(inputVal));

    }

    public static int getVal(String val) {
        if (val.charAt(0) == '0') return -1;
        String cVal = "";
        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            cVal = cVal+ val.charAt(i);
            if ((i < val.length()-1 && val.charAt(i+1) == '0') || new BigInteger(cVal).longValue() == 0 || new BigInteger(cVal).remainder(BigInteger.TWO).longValue() == 0) {
                if (i == val.length()-1) return -1;
                continue;
            }
            cVal = "";
            count++;
        }
        return count;
    }


}
