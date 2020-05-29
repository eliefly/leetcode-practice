package com.github.eliefly.leetcode.s687;

import com.github.eliefly.leetcode.common.TreeNode;

class Solution {

    int ans = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        arrowLength(root, root.val);
        return ans;
    }

    public int arrowLength(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }
        int left = arrowLength(node.left, node.val);
        int right = arrowLength(node.right, node.val);
        ans = Math.max(ans, left + right);
        if (node.val == val) {
            return Math.max(left, right) + 1;
        } else {
            return 0;
        }
    }
}

