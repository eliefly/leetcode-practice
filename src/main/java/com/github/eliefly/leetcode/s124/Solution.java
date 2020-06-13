package com.github.eliefly.leetcode.s124;

import com.github.eliefly.leetcode.common.TreeNode;

class Solution {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = Math.max(maxGain(root.left), 0);
        int maxRight = Math.max(maxGain(root.right), 0);
        maxSum = Math.max(maxLeft + maxRight + root.val, maxSum);
        return Math.max(maxLeft + root.val, maxRight + root.val);
    }
}