package com.github.eliefly.leetcode.s46;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Solution
 *
 * @author huangfl
 * @date 20/6/7
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[length];
        dfs(nums, path, used, res);
        return res;
    }

    private void dfs(int[] nums, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, path, used, res);
            path.pollLast();
            used[i] = false;
        }
    }
}
