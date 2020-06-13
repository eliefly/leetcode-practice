package com.github.eliefly.leetcode.s104;

import com.github.eliefly.leetcode.common.TreeNode;
import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution2 {

    public int maxDepth(TreeNode root) {
        Deque<Pair<TreeNode, Integer>> deque = new LinkedList<>();
        if (root != null) {
            deque.add(new Pair<>(root, 1));
        }
        int depth = 0;
        while (!deque.isEmpty()) {
            Pair<TreeNode, Integer> cur = deque.pollFirst();
            root = cur.getKey();
            int curDepth = cur.getValue();
            if (root != null) {
                depth = Math.max(depth, curDepth);
                deque.add(new Pair<>(root.left, curDepth + 1));
                deque.add(new Pair<>(root.right, curDepth + 1));
            }
        }
        return depth;
    }
}