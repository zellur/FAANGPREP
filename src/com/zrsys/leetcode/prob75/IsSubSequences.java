package com.zrsys.leetcode.prob75;

public class IsSubSequences {
    /*
    * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
    * characters without disturbing the relative positions of the remaining characters.
    * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    * */


    public static void main(String[] args) {
        System.out.println(new IsSubSequences().isSubsequence("ace", "abcde"));
//        System.out.println(new IsSubSequences().isSubsequence("aaaaaa", "bbaaaa"));
    }
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        char curChar;
        int index;
        for (int i = 0; i < s.length(); i++) {
            curChar = s.charAt(i);
            index = t.indexOf(curChar);
            if (index >= 0) {
                t = t.substring(index+1);
            } else {
                return false;
            }
        }
        return true;
    }
}
