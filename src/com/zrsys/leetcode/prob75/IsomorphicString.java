package com.zrsys.leetcode.prob75;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(new IsomorphicString().isIsomorphic("paper", "title"));
        System.out.println(new IsomorphicString().isIsomorphic("badc", "baba"));

        /*
         * p => t b => b
         * a => i a => a
         * p => t d => b
         * e => l c => a
         * r => e
         * */
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        Character curChar;
        Character curChar2;
        for (int i = 0; i < s.length(); i++) {
            curChar = s.charAt(i);
            curChar2 = t.charAt(i);
            if (charMap.get(curChar) == null) {
                if (charMap.values().contains(curChar2)) return false;
                charMap.put(curChar, curChar2);
            } else if (charMap.get(curChar) != curChar2) {
                return false;
            }
        }
        return true;
    }
}
