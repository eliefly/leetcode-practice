package com.github.eliefly.leetcode.s198;

import org.junit.Test;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/7/4
 */
public class TestCase {

    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] nums = {7, 1, 1, 6};
        int res = solution.rob(nums);
        System.out.println(res);
    }

    @Test
    public void test02() {
        Solution1 solution = new Solution1();
        int[] nums = {7, 1, 1, 6};
        int res = solution.rob(nums);
        System.out.println(res);
    }
}
