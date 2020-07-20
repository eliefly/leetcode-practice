package com.github.eliefly.leetcode.s105;

import com.github.eliefly.leetcode.common.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        return buildTree(preorder, 0, preLen - 1, inorder, 0, inLen - 1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight,
                               int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLeft]);
        int pivot = inLeft;
        while (inorder[pivot] != root.val) {
            pivot++;
        }
        root.left = buildTree(preorder, preLeft + 1, preLeft + pivot - inLeft,
                inorder, inLeft, pivot - 1);
        root.right = buildTree(preorder, preLeft + pivot - inLeft + 1, preRight,
                inorder, pivot + 1, inRight);
        return root;
    }
}