package com.github.eliefly.leetcode.s416;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/6/2
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] ints = {1, 2, 5};
        Solution1 solution1 = new Solution1();
        boolean b = solution1.canPartition(ints);
        System.out.println(b);
    }

    /**
     * 动态规划-二维数组存储状态
     * <p>
     * 执行用时 :26 ms, 在所有 Java 提交中击败了54.95% 的用户
     * 内存消耗 :40.1 MB, 在所有 Java 提交中击败了5.88%的用户
     *
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int capacity = sum / 2;
        boolean[][] states = new boolean[length][capacity + 1];
        states[0][0] = true;
        if (nums[0] <= capacity) {
            states[0][nums[0]] = true;
        }
        for (int i = 1; i < length; i++) {
            // 不放入
            for (int j = 0; j <= capacity; j++) {
                if (states[i - 1][j]) {
                    states[i][j] = true;
                    if (j == capacity) {
                        return true;
                    }
                }
            }
            // 放入
            for (int j = 0; j <= capacity - nums[i]; j++) {
                if (states[i - 1][j]) {
                    states[i][j + nums[i]] = true;
                    if (j + nums[i] == capacity) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
