package com.github.eliefly.leetcode.s144;

import com.github.eliefly.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }
}