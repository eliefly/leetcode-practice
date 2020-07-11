package com.github.eliefly.leetcode.s215;

import org.junit.Test;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/7/4
 */
public class TestCase {

    @Test
    public void test02() {
        Solution2 solution = new Solution2();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int res = solution.findKthLargest(nums, 6);
        System.out.println(res);
    }

}
