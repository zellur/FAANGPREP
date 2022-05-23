package com.zrsys.kickstart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NewPass {
    /*
    * A company named Gooli has issued a new policy that their employees account passwords must contain:

At least 7 characters.
At least one uppercase English alphabet letter.
At least one lowercase English alphabet letter.
At least one digit.
At least one special character. There are four special characters: #, @, *, and &.
The company has asked all the employees to change their passwords if the above requirements are not satisfied. Charles, an employee at Gooli, really likes his old password. In case his old password does not satisfy the above requirements, Charles will fix it by appending letters, digits, and special characters. Can you help Charles to find the shortest possible new password that satisfies his company's requirements?

Input
*
The first line of the input gives the number of test cases, T.
* T test cases follow. Each test case consists of two lines.
*  The first line of each test case contains an integer N,
* denoting the length of the old password.
* The second line of each test case contains the old password of length N.
* Old password contains only digits, letters, and special characters.
    * */

    public static Map<String, Data> testCasesMap = new HashMap<>();
    public static List<Character> sChar = List.of('#', '@', '*', '&');

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;

        while (i <= t) {
            testCasesMap.put("Case #"+i+": ", new Data(sc.nextInt(), sc.next()));
            i++;
        }
        for (Map.Entry<String, Data> entry : testCasesMap.entrySet()) {
            System.out.println(entry.getKey() + makeValid(entry.getValue()).pass);
        }
    }

    public static Data makeValid(Data data) {
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSchar = false;

        String missing = "";

        for (char c : data.pass.toCharArray()) {
            if (c >= 'A' && c <= 'Z') isUpper = true;
            if (c >= 'a' && c <= 'z') isLower = true;
            if (c >= '0' && c <= '9') isDigit = true;
            if (sChar.contains(c)) isSchar = true;
        }
        if (!isUpper) missing += "A";
        if (!isLower) missing += "a";
        if (!isDigit) missing += 1;
        if (!isSchar) missing += "#";

        data.pass = data.pass + missing;
        if (data.pass.length() < 7) IntStream.range(0, 7- data.pass.length()).forEach(x -> data.pass = data.pass + "a");
        return data;
    }


    static class Data {
        public int length;
        public String pass;

        public Data(int length, String pass) {
            this.length = length;
            this.pass = pass;
        }
    }

}
