package com.github.eliefly.leetcode.s56;

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

        /**
         * 输入:
         [[2,3],[4,5],[6,7],[8,9],[1,10]]
         输出
         [[2,3],[4,5],[6,7],[1,10]]
         */
        Solution solution = new Solution();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = solution.merge(intervals);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void test02() {

        /**
         * 输入:
         [[2,3],[4,5],[6,7],[8,9],[1,10]]
         输出
         [[2,3],[4,5],[6,7],[1,10]]
         */
        Solution2 solution = new Solution2();
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] res = solution.merge(intervals);
        System.out.println(Arrays.toString(res));
    }

}
