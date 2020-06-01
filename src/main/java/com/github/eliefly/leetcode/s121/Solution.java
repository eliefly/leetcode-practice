package com.github.eliefly.leetcode.s121;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {7, 6, 4, 3, 1};
        int res = solution.maxProfit(arr);
        System.out.println(res);
    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - buy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < buy) {
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}