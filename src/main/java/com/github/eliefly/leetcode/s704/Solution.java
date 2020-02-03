package com.github.eliefly.leetcode.s704;

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midNum = nums[mid];
            if (midNum == target) {
                return mid;
            } else if (midNum > target) {
                high = mid - 1;
            } else if (midNum < target) {
                low = low + 1;
            }
        }
        return -1;
    }
}