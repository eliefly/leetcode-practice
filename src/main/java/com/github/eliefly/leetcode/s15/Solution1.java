package com.github.eliefly.leetcode.s15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/6/4
 */
public class Solution1 {
    /**
     * 去重
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
}
