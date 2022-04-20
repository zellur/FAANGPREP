package com.zrsys.Codeforces;

import java.util.Scanner;

public class ArraySum {

    /*
    * You are given two arrays of length n: a1,a2,…,an and b1,b2,…,bn.

You can perform the following operation any number of times:

Choose integer index i (1≤i≤n);
Swap ai and bi.
What is the minimum possible sum |a1−a2|+|a2−a3|+⋯+|an−1−an| + |b1−b2|+|b2−b3|+⋯+|bn−1−bn| (in other words, ∑i=1n−1(|ai−ai+1|+|bi−bi+1|)) you can achieve after performing several (possibly, zero) operations?

Input
The first line contains a single integer t (1≤t≤4000) — the number of test cases. Then, t test cases follow.

The first line of each test case contains the single integer n (2≤n≤25) — the length of arrays a and b.

The second line of each test case contains n integers a1,a2,…,an (1≤ai≤109) — the array a.

The third line of each test case contains n integers b1,b2,…,bn (1≤bi≤109) — the array b.

Output
For each test case, print one integer — the minimum possible sum ∑i=1n−1(|ai−ai+1|+|bi−bi+1|).
*
* 3
4
3 3 10 10 => (3-3)+(3-10)+(10-10) = 0+7+0 = 7
10 10 3 3 => (10-10)+(10-3)+(3-3) = 0+7+0 = 7
*
* In the first test case, we can, for example, swap a3 with b3 and a4 with b4. We'll get arrays a=[3,3,3,3] and b=[10,10,10,10] with sum 3⋅|3−3|+3⋅|10−10|=0
5
1 2 3 4 5
6 7 8 9 10
6
72 101 108 108 111 44 => 10-87 87-108 108-108 108-108 108-44 = 77 + 21 + 0 + 0 + 64
10 87 111 114 108 100 => 72-101 101-111 111-114 114-111 111-100 = 29 + 10 + 3 + 3 + 11
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] testArr1 = new long[0];
        long[] testArr2 = new long[0];
        long t = sc.nextLong();
        while (t > 0) {
            int n = sc.nextInt();
             testArr1 = new long[n];
             testArr2 = new long[n];

            for (int i = 0; i < n; i++) {
                testArr1[i] = Long.parseLong(sc.next());
            }

            for (int i = 0; i < n; i++) {
                testArr2[i] = Long.parseLong(sc.next());
            }

            t--;
            printData(testArr1, testArr2);
            if (t == 0) break;
        }
    }

    public static void printData(long[] a, long[] b) {
        long sum = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > b[i]) {
                var tmp = a[i];
                a[i] = b[i];
                b[i] = tmp;
            }
            if (a[i+1] > b[i+1]) {
                var tmp = a[i+1];
                a[i+1] = b[i+1];
                b[i+1] = tmp;
            }

            sum = sum + Math.abs(a[i] - a[i + 1]) + Math.abs(b[i] - b[i+1]);
        }
        System.out.println(sum);
    }

}
//72 101 108 108 111 44
//10 87 111 114 108 100