package com.github.eliefly.leetcode.s62;

class Solution2 {

    /**
     * 动态规划
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int col = 0; col < n; ++col) {
            matrix[0][col] = 1;
        }
        for (int row = 0; row < m; ++row) {
            matrix[row][0] = 1;
        }
        for (int row = 1; row < m; ++row) {
            for (int col = 1; col < n; ++col) {
                matrix[row][col] = matrix[row - 1][col] + matrix[row][col - 1];
            }
        }
        return matrix[m - 1][n - 1];
    }

}