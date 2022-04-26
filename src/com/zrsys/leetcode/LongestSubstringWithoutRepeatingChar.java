package com.zrsys.leetcode;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcabb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String test = "";
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        String cur;
        int maxLen = -1;

        for (char c : s.toCharArray()) {
            cur = String.valueOf(c);
            if (test.contains(cur)) {
                test = test.substring(test.indexOf(cur) + 1);
            }
            test = test+cur;
            maxLen = Math.max(maxLen, test.length());
        }
        return maxLen;
    }
}
