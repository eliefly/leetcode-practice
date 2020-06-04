package com.github.eliefly.leetcode.s15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    /**
     * 没想到如何去重
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        Set<Integer> mems = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (mems.contains(nums[i])) {
                continue;
            }
            mems.add(nums[i]);
            for (int j = i + 1; j < nums.length; ++j) {
                int complement = 0 - (nums[i] + nums[j]);
                if (map.containsKey(complement)) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], complement));
                    res.add(list);
                }
            }
        }
        return res;
    }
}
