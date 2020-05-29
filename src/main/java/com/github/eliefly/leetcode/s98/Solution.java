package com.github.eliefly.leetcode.s98;

import com.github.eliefly.leetcode.common.TreeNode;

class Solution {

    private long lastVal = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return middleOrder(root);
    }

    private boolean middleOrder(TreeNode node) {
        // 终止条件
        if (node == null) {
            return true;
        }

        if (!middleOrder(node.left)) {
            return false;
        }
        if (node.val <= lastVal) {
            return false;
        }
        lastVal = node.val;
        if (!middleOrder(node.right)) {
            return false;
        }
        return true;
    }
}