package com.github.eliefly.leetcode.s40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 * <p>
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 */
class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(this.candidates);
        Deque<Integer> path = new LinkedList<>();
        int sum = 0;
        backtrack(0, sum, path);
        return res;
    }

    private void backtrack(int begin, int sum, Deque<Integer> path) {
        if (target == sum) {
            res.add(new ArrayList<>(path));
        }
        for (int i = begin; i < candidates.length; i++) {
            // 去重的做法太6了
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] <= target) {
                path.addLast(candidates[i]);
                backtrack(i + 1, sum + candidates[i], path);
                path.removeLast();
            } else {
                // ？？ 剪枝
                return;
            }
        }
    }

}