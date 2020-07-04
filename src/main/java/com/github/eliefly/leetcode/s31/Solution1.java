package com.github.eliefly.leetcode.s31;

import java.util.Arrays;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须原地修改，只允许使用额外常数空间。
 * <p>
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution1 {
    // 错误
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int index = length - 1;
        int rear = nums[index];
        for (int i = length - 2; i >= 0; i--) {
            if (rear > nums[i]) {
                nums[index] = nums[i];
                nums[i] = rear;
                return;
            } else if (rear < nums[i]) {
                rear = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
    }
}