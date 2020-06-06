package com.github.eliefly.leetcode.s16;

import org.junit.Test;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class TestCase {

    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] nums = {-1, 2, 1, -4};
        int i = solution.threeSumClosest(nums, 1);
        System.out.println(i);
    }

}
