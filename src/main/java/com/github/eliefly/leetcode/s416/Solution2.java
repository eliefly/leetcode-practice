package com.github.eliefly.leetcode.s416;

/**
 * Solution2
 *
 * @author huangfl
 * @date 20/6/2
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] a = {1, 1};
        Solution2 solution2 = new Solution2();
        boolean b = solution2.canPartition(a);
        System.out.println(b);
    }

    /**
     * 动态规划-一维状态数组
     * 执行用时 :8 ms, 在所有 Java 提交中击败了91.06% 的用户
     * 内存消耗 :37.8 MB, 在所有 Java 提交中击败了29.41%的用户
     *
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int capacity = sum / 2;
        boolean[] states = new boolean[capacity + 1];
        states[0] = true;
        if (nums[0] <= capacity) {
            states[nums[0]] = true;
        }
        if (states[capacity]) {
            return true;
        }
        for (int i = 1; i < length; ++i) {
            for (int j = capacity - nums[i]; j > 0; --j) {
                if (states[j]) {
                    states[j + nums[i]] = true;
                }
                if (states[capacity]) {
                    return true;
                }
            }
        }
        return false;
    }
}
