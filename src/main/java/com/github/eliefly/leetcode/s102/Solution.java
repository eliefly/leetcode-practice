package com.github.eliefly.leetcode.s102;

import com.github.eliefly.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    // 自己做的，使用两个 LinkedList 辅助
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> curLevel = new LinkedList<TreeNode>();
        Deque<TreeNode> nextLevel = new LinkedList<TreeNode>();
        nextLevel.offer(root);
        while (!nextLevel.isEmpty()) {
            curLevel = nextLevel;
            nextLevel = curLevel;
            nextLevel.clear();
            List<Integer> level = new ArrayList<>(curLevel.size());
            while (!curLevel.isEmpty()) {
                TreeNode node = curLevel.poll();
                level.add(node.val);
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}