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
        Solution1 solution = new Solution1();
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);

        System.out.println(Arrays.asList(nums1).toString());
    }
}
