package com.github.eliefly.leetcode.s15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution2
 *
 * @author huangfl
 * @date 2020/6/5
 */
public class Solution2 {

    /**
     * 给定数组 nums = [-1, 0, 1, 2, -1, -4]
     * -4, -1, -1, 0, 1, 2
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    res.add(list);
                    ++j;
                    --k;
                    // 去重
                    while (k > j && nums[j] == nums[j - 1]) {
                        ++j;
                    }
                    while (k > j && nums[k] == nums[k + 1]) {
                        --k;
                    }
                } else if (nums[j] + nums[k] > target) {
                    --k;
                } else {
                    ++j;
                }
            }
        }
        return res;
    }
}
