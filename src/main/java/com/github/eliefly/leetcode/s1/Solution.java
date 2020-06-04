package com.github.eliefly.leetcode.s1;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                Integer j = map.get(target - nums[i]);
                if (i == j) {
                    continue;
                }
                return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums = {3, 2, 4};
        int[] ints = solution.twoSum(nums, 6);
        System.out.println(Arrays.toString(ints));
    }
}