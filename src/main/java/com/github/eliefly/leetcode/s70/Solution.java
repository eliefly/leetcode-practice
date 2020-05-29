package com.github.eliefly.leetcode.s70;

class Solution {

    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        return recurs(cache, n);
    }

    private int recurs(int[] cache, int n) {
        // 1.终止条件
        if (n <= 2) {
            return n;
        }
        // 2.处理本层数据
        if (cache[n] > 0) {
            return cache[n];
        }
        // 3.递归调用
        cache[n] = recurs(cache, n - 1) + recurs(cache, n - 2);
        return cache[n];
    }

}