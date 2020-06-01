package com.github.eliefly.leetcode.s122;

/**
 * Solution1
 *
 * @author huangfl
 * @date 2020/6/1
 */
public class Solution1 {

    /**
     * 题解
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

}
