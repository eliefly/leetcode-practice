package com.github.eliefly.leetcode.s598;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(Node root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node node : root.children) {
            preorder(node, res);
        }
    }
}