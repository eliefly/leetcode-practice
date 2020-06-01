package com.github.eliefly.leetcode.s122;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 4};
        int res = solution.maxProfit(arr);
        System.out.println(res);
    }

    /**
     * 峰谷法：自己写的，题解中有更简洁的写法
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] - minBuy > 0 && prices[i] > prices[i + 1]) {
                maxProfit = maxProfit + prices[i] - minBuy;
                minBuy = prices[i + 1];
            } else if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        if (prices[prices.length - 1] >= prices[prices.length - 2]) {
            if (prices[prices.length - 1] > minBuy) {
                maxProfit = maxProfit + prices[prices.length - 1] - minBuy;
            }
        }
        return maxProfit;
    }

}