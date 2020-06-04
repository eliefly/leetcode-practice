package com.github.eliefly.leetcode.s15;

import org.junit.Test;

import java.util.List;

/**
 * TestCase
 *
 * @author huangfl
 * @date 20/6/4
 */
public class TestCase {

    @Test
    public void test01() {
        int[] ints = {0, 0, 0, 0};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(ints);
        System.out.println(lists);
    }

}
