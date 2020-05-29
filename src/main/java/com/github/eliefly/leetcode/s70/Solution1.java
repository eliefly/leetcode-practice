package com.github.eliefly.leetcode.s70;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/5/4
 */
class Solution1 {
    // 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户内存消耗 :
    // 33.2 MB, 在所有 Java 提交中击败了70.25%的用户
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}