package com.github.eliefly.leetcode.s104;

import com.github.eliefly.leetcode.common.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        int depth = 0;
        dfs(root, depth);
        return maxDepth;

    }

    private void dfs(TreeNode root, int depth) {
        // 终止
        if (root == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
            }
            return;
        }
        // 处理数据
        depth++;
        // 下一层
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}