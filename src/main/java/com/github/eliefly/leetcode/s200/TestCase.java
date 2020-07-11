package com.github.eliefly.leetcode.s200;

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
        char[][] grids = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int res = solution.numIslands(grids);
        System.out.println(res);
    }

    @Test
    public void test02() {
        Solution2 solution = new Solution2();
        char[][] grids = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int res = solution.numIslands(grids);
        System.out.println(res);
    }

}
