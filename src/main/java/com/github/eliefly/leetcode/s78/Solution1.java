package com.github.eliefly.leetcode.s78;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author huangfl
 * @date 2020/6/28
 */
class Solution1 {

    private List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        int length = nums.length;
        for (int size = 0; size <= length; size++) {
            backtrack(0, size, subset, nums, length);
        }
        return res;
    }

    private void backtrack(int first, int size, List<Integer> subset, int[] nums, int length) {
        if (subset.size() == size) {
            res.add(new ArrayList<>(subset));
            return;
        }
        for (int j = first; j < length; j++) {
            subset.add(nums[j]);
            backtrack(j + 1, size, subset, nums, length);
            subset.remove(subset.size() - 1);
        }
    }

}