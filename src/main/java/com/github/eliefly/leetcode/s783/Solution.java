package com.github.eliefly.leetcode.s783;

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

    private Integer minDiff = Integer.MAX_VALUE;
    private Integer prev;

    public int minDiffInBST(TreeNode root) {
        prev = null;
        getMinDiff(root);
        return minDiff;
    }

    private void getMinDiff(TreeNode node) {
        if (node == null) {
            return;
        }
        getMinDiff(node.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;
        getMinDiff(node.right);

    }
}