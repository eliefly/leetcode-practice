package com.github.eliefly.leetcode.s416;

class Solution {

    /**
     * 回溯算法，超时时间限制
     */
    private boolean flag = false;

    public static void main(String[] args) {
        int[] ints = {1, 5, 11, 5};
        Solution solution = new Solution();
        boolean b = solution.canPartition(ints);
        System.out.println(b);

    }

    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum / 2;
        int accum = 0;
        foo(0, nums, accum, target);
        return flag;
    }

    private void foo(int i, int[] nums, int accum, int target) {
        if (flag || accum == target || i == nums.length) {
            if (accum == target) {
                this.flag = true;
            }
            return;
        }
        foo(i + 1, nums, accum, target);
        if (accum + nums[i] <= target) {
            foo(i + 1, nums, accum + nums[i], target);
        }
    }
}