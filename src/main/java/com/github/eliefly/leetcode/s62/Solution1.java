package com.github.eliefly.leetcode.s62;

class Solution1 {

    /**
     * 自己做的
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        return dp(m - 1, n - 1, matrix);
    }

    private int dp(int m, int n, int[][] matrix) {
        if (m == 0 || n == 0) {
            return 1;
        }
        // 剪枝，空间换时间
        if (matrix[m][n] != 0) {
            return matrix[m][n];
        }
        matrix[m][n] = dp(m - 1, n, matrix) + dp(m, n - 1, matrix);
        return matrix[m][n];
    }
}