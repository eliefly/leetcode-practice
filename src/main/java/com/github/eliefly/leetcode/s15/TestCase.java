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
        int[] ints = {-1, 0, 1, 2, -1, -4};
        Solution2 solution = new Solution2();
        List<List<Integer>> lists = solution.threeSum(ints);
        System.out.println(lists);
    }

}
