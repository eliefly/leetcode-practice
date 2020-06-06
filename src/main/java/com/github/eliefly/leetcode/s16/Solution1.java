package com.github.eliefly.leetcode.s16;

import java.util.Arrays;

/**
 * Solution1
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class Solution1 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDifff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = sum - target;
                if (diff == 0) {
                    return sum;
                } else if (diff > 0) {
                    --k;
                    while (j < k && nums[k] == nums[k + 1]) {
                        --k;
                    }
                } else {
                    ++j;
                    while (j < k && nums[j] == nums[j - 1]) {
                        ++j;
                    }
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