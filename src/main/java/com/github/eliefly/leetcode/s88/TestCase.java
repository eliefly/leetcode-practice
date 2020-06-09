package com.github.eliefly.leetcode.s88;

import java.util.Arrays;

/**
 * TestCase
 *
 * @author huangfl
 * @date 20/6/10
 */
public class TestCase {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 6, nums2, 3);

        System.out.println(Arrays.asList(nums1).toString());
    }
}
