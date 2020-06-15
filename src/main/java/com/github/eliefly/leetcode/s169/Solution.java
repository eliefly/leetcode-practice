package com.github.eliefly.leetcode.s169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.merge(num, 1, (a, b) -> a + b);
            if (map.get(num) > nums.length / 2) {
                res = num;
                break;
            }

        }
        return res;
    }
}