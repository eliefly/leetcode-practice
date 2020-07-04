package com.github.eliefly.leetcode.s55;

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
        Solution1 solution = new Solution1();
//        int[] nums = {2, 3, 1, 1, 4};
        int[] nums = {3, 2, 1, 0, 4};
        boolean b = solution.canJump(nums);
        System.out.println(b);
    }

    @Test
    public void test02() {
        Solution2 solution = new Solution2();
        int[] nums = {3, 0, 8, 2, 0, 0, 1};
        boolean b = solution.canJump(nums);
        System.out.println(b);
    }

}
