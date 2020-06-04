package com.github.eliefly.leetcode.s1;

import java.util.HashMap;

/**
 * Solution1
 *
 * @author huangfl
 * @date 2020/6/4
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
