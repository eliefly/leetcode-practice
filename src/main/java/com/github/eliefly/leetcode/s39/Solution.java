package com.github.eliefly.leetcode.s39;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {

    // 排序剪枝
    /*private int target;
    private int[] candidates;
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        Arrays.sort(this.candidates);
        int sum = 0;
        Deque<Integer> path = new LinkedList<>();
        backtrack(0, path, sum);
        return res;
    }

    private void backtrack(int begin, Deque<Integer> path, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
        }

        for (int i = begin; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                return;
            }
            path.addLast(candidates[i]);
            backtrack(i, path, sum + candidates[i]);
            path.removeLast();
        }
    }*/

    // 无需排序
    private int target;
    private int[] candidates;
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        // Arrays.sort(this.candidates);
        int sum = 0;
        Deque<Integer> path = new LinkedList<>();
        backtrack(0, path, sum);
        return res;
    }

    private void backtrack(int begin, Deque<Integer> path, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
        }

        for (int i = begin; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                path.addLast(candidates[i]);
                backtrack(i, path, sum + candidates[i]);
                path.removeLast();
            }
        }
    }
}