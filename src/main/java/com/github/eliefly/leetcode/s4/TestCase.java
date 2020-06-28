package com.github.eliefly.leetcode.s4;

import org.junit.Test;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/28
 */
public class TestCase {

    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double res = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

    @Test
    public void test02() {
        System.out.println(5 / 2);
    }

}
