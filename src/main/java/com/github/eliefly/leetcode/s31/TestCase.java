package com.github.eliefly.leetcode.s31;

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
        Solution1 solution = new Solution1();
        int[] nums = {1, 3, 2};
        solution.nextPermutation(nums);
        // 2,1,3
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test02() {
        Solution2 solution = new Solution2();
        int[] nums = {1, 3, 2};
        solution.nextPermutation(nums);
        // 1, 2, 5, 4, 6
        System.out.println(Arrays.toString(nums));
    }
}
