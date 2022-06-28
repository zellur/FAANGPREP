package com.zrsys.codeforces.SIT;

import java.util.Scanner;

public class ExcelSheet {

    /*
    * Louis has to manage a massive Excel sheet. It contains n rows and m columns, each cell contains one lowercase Latin letter. The rows are numbered from 1 to n from top to bottom. The columns are numbered from 1 to m from left to right.

    Louis wants to count the number of neat rectangles in the table. He considers a rectangle of cells neat if it has the same letter written in all of its corners. Note that Louis is not interested in rectangles that have less than four corner cells, i. e. that have only one row and/or only one column.

    He wrote an Excel formula to do that, but sadly it turned out neither fast, nor correct. Luckily, you are free to use any programming language to implement it. Can you help Louis with his task?

    Input
    The first line contains two integers n and m (2≤n,m≤400) — the number of rows and the number of columns in the table.

    The i-th of the next n rows contains a description of the i-th row — a string of length m. Each character is a lowercase Latin letter.

    Output
    Print a single integer — the number of neat rectangles in the table.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i = 0;
        String[] arr = new String[n];

        while (i < n) {
            String d = sc.next();
            arr[i] = d;
            i++;
        }

        int count = 0;

        for (int j = 0; i < arr.length; j++) {
            for (int k = j+1; k < arr.length; k++) {

            }
        }

        System.out.println(count);
    }
}
