package com.github.eliefly.leetcode.s53;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = Integer.MIN_VALUE;
        for (int ele : nums) {
            if (sum > 0) {
                sum = sum + ele;
            } else {
                sum = ele;
            }
            res = Math.max(sum, res);
        }
        return res;
    }

}
