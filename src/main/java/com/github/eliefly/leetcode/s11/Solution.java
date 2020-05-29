package com.github.eliefly.leetcode.s11;

// 暴力解法
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; ++i) {
            for (int j = i + 1; j < height.length; ++j) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }
}