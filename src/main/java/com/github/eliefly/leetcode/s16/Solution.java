package com.github.eliefly.leetcode.s16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDifff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = sum - target;
                if (diff == 0) {
                    return sum;
                } else if (diff > 0) {
                    --k;
                } else {
                    ++j;
                }
                if (Math.abs(diff) < minDifff) {
                    minDifff = Math.abs(diff);
                    res = sum;
                }
            }
        }
        return res;
    }
}