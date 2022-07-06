package com.zrsys.leetcode.prob75;

public class BuySellStock {
    /*
    * You are given an array prices where prices[i] is the price of a given stock on the ith day.

      You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

      Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

     Input: prices = [7,1,5,3,6,4]
     Output: 5
     Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     *
     * buy -> 7 => 7 > 1 ? buy = 1 sell 5 buy 5 5 > 3 buy = 3

    * */

    public static void main(String[] args) {
//        System.out.println(new BuySellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BuySellStock().maxProfit(new int[]{2,1,2,1,0,1,2}));
    }

    public int maxProfit(int[] prices) {
       int profit = 0;
       int left = 0;
       int right = 1;

       while (right < prices.length) {
           profit = Math.max(prices[right] - prices[left], profit);
           if (prices[right] < prices[left]) left = right;
           right++;
       }
       return profit;
    }
}
