package com.github.eliefly.leetcode.s54;

import java.util.LinkedList;
import java.util.List;

class Solution {

    /**
     * 输入:
     * [
     * [ 1, 2, 3 ],
     * [ 4, 5, 6 ],
     * [ 7, 8, 9 ]
     * ]
     * 输出: [1,2,3,6,9,8,7,4,5]
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix.length == 0) {
            return res;
        }
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int col = left; col <= right; ++col) {
                res.add(matrix[up][col]);
            }
            if (++up > down) {
                break;
            }
            for (int row = up; row <= down; ++row) {
                res.add(matrix[row][right]);
            }
            if (--right < left) {
                break;
            }
            for (int col = right; col >= left; --col) {
                res.add(matrix[down][col]);
            }
            if (--down < up) {
                break;
            }
            for (int row = down; row >= up; --row) {
                res.add(matrix[row][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }
}