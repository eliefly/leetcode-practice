package com.github.eliefly.leetcode.s33;

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
        int[] ints = {4, 5, 6, 7, 0, 1, 2};
        int res = solution.search(ints, 0);
        System.out.println(res);
    }

}
