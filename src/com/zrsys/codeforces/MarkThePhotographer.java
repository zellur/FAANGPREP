package com.zrsys.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MarkThePhotographer {

    /*
    * Mark is asked to take a group photo of 2n people. The i-th person has height hi units.

    To do so, he ordered these people into two rows, the front row and the back row, each consisting of n people. However, to ensure that everyone is seen properly, the j-th person of the back row must be at least x units taller than the j-th person of the front row for each j between 1 and n, inclusive.

    Help Mark determine if this is possible.

    Input
    The first line contains one integer t (1≤t≤100) — the number of test cases. Each test case consists of two lines.

    The first line of each test case contains two positive integers n and x (1≤n≤100, 1≤x≤103) — the number of people in each row and the minimum difference Mark wants.

    The second line of each test case contains 2n positive integers h1,h2,…,h2n (1≤hi≤103) — the height of each person in units.

    Note that the sum of n over all test cases is not bounded.

    Output
    For each test case, print a single line containing "YES" if Mark could arrange people satisfying his condition and "NO" otherwise.

    You may print each letter in any case (for example, YES, Yes, yes, yEs will all be recognized as positive answers).
    * */

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int tc = sc.nextInt();
        int n, x;

        while (tc > 0) {
            n = sc.nextInt();
            x = sc.nextInt();
            List<Integer> heights = new ArrayList<>();
            IntStream.range(0, n*2)
                    .forEach(l -> heights.add(sc.nextInt()));

            Collections.sort(heights);

            int start = n;

            String retVal = "YES";
            for (int i = 0; i < n; i++) {
                if (heights.get(start) - heights.get(i) < x) {
                    retVal = "NO";
                }
                start++;
            }

            System.out.println(retVal);
            tc--;
        }
    }


}
