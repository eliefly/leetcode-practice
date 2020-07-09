package com.github.eliefly.leetcode.s34;

import org.junit.Test;

import java.util.Arrays;

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
        int[] nums = {5, 7, 7, 10};
        int[] res = solution.searchRange(nums, 8);
        System.out.println(Arrays.toString(res));
    }

}
