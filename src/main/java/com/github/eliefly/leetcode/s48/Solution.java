package com.github.eliefly.leetcode.s48;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    //
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) {
            return;
        }
        int cols = matrix[0].length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                deque.offer(matrix[i][j]);
            }
        }
        for (int j = cols - 1; j >= 0; j--) {
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = deque.pollFirst();
            }
        }
    }
}