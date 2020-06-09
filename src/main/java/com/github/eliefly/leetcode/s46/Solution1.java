package com.github.eliefly.leetcode.s46;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/6/7
 */
public class Solution1 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, path, res);
        return res;
    }

    private void dfs(int[] nums, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int num : nums) {
            if (!path.contains(num)) {
                path.addLast(num);
                dfs(nums, path, res);
                path.pollLast();
            }
        }
    }
}
