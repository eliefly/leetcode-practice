package com.github.eliefly.leetcode.s59;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int up = 0, down = n - 1, left = 0, right = n - 1;
        while (num <= n * n) {
            for (int col = left; col <= right; ++col) {
                matrix[up][col] = num++;
            }
            ++up;
            for (int row = up; row <= down; ++row) {
                matrix[row][right] = num++;
            }
            --right;
            for (int col = right; col >= left; --col) {
                matrix[down][col] = num++;
            }
            --down;
            for (int row = down; row >= up; --row) {
                matrix[row][left] = num++;
            }
            ++left;
        }
        return matrix;
    }
}