package com.github.eliefly.leetcode.s230;

import com.github.eliefly.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /**
     * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
     * <p>
     * 说明：
     * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        dfs(root, nums, k);
        return nums.get(k - 1);
    }

    private void dfs(TreeNode root, List<Integer> nums, int k) {
        if (root == null || nums.size() >= k) {
            return;
        }
        dfs(root.left, nums, k);
        nums.add(root.val);
        dfs(root.right, nums, k);
    }
}