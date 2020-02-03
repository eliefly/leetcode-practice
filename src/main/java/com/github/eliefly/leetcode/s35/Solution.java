package com.github.eliefly.leetcode.s35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (target < nums[low]) {
            return low - 1;
        }
        if (target > nums[high]) {
            return high + 1;
        }
        while (low <= high) {
            int mid = low + ((high - low) >> 1);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }

        return low;
    }
}