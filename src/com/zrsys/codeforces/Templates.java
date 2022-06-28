package com.zrsys.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Templates {

    /*
    * 4
.123
.456
.789
0123
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> stringList = new ArrayList<>();

        IntStream.rangeClosed(1, t).forEach(x -> stringList.add(sc.next()));
        int strLen = stringList.get(0).length();
        String retVal = "";
        String ex = stringList.get(0);

        for (int i = 0; i < strLen; i++) {
            for (int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).charAt(i) != ex.charAt(i)) {
                    retVal += "?";
                    break;
                }
                if (j == stringList.size() - 1) retVal += stringList.get(j).charAt(i);
            }
        }
        System.out.println(retVal);

    }
}
