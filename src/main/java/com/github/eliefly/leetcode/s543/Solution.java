package com.github.eliefly.leetcode.s543;

import com.github.eliefly.leetcode.common.TreeNode;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * 示例 :
 * 给定二叉树
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * <p>
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 * <p>
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {

    // 做错了
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int deep = 0;
        int maxLeft = 0;
        int maxRight = 0;
        maxLeft = dfs(root.left, deep, maxLeft);
        maxRight = dfs(root.right, deep, maxRight);
        return maxLeft + maxRight;
    }

    private int dfs(TreeNode root, int deep, int maxDeep) {
        if (root == null) {
            return maxDeep;
        }
        deep++;
        if (deep > maxDeep) {
            maxDeep = deep;
        }
        int left = dfs(root.left, deep, maxDeep);
        int right = dfs(root.right, deep, maxDeep);
        return Math.max(left, right);
    }

}