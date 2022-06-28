package com.zrsys.kickstart;

import java.util.List;

public class RangePartition {

    public static void main(String[] args) {
        System.out.println(findMax(List.of(7, 4, 5, 2, 6, 5)));
    }

    public static int returnPair(List<String> login) {
        int count = 0;
        for (int i = 0; i < login.size(); i++) {
            for (int j = i+1; j < login.size(); j++) {
                if (isFamilly(login.get(i), login.get(j))) count++;
            }
        }
        return count;
    }

    static boolean isFamilly(String s1, String s2) {
        boolean rightRot = true;
        boolean leftRot = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != (s2.charAt(i) == 'z' ? 'a' : s2.charAt(i) + 1)) rightRot = false;
            if (s2.charAt(i) != (s1.charAt(i) == 'z' ? 'a' : s1.charAt(i) + 1)) leftRot = false;
        }
        return rightRot || leftRot;
    }

    static long findMax(List<Integer> products) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < products.size(); i++) {
            for (int j = i+1; j < products.size(); j++) {
                max = Math.max(getSum(products.subList(i,j)), max);
            }
        }
        return max;
    }

    static long getSum(List<Integer> subProds) {
        if (subProds.size() == 1) return subProds.get(0);
        long sum = 0;
        for (int i = 0; i < subProds.size()-1; i++) {
            if (subProds.get(i) >= subProds.get(i+1)) {
                sum += subProds.get(i+1)-1;
            } else {
                sum += subProds.get(i);
            }
        }
        return sum+subProds.get(subProds.size() -1);
    }

}

/*
*
* 3 4 5 2
* 3 > 4 ? yes
* 4 > 5 ? yes
* 5 > 2 ? no => make 5 -> 1 , 2
* */