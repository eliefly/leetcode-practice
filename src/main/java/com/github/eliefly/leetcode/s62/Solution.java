package com.github.eliefly.leetcode.s62;

class Solution {
    /**
     * 超出时间
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        return dp(m - 1, n - 1);
    }

    private int dp(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        return dp(m - 1, n) + dp(m, n - 1);
    }
}