package com.github.eliefly.leetcode.s54;

import java.util.List;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/8
 */
public class TestCase {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(arr);
        System.out.println(integers);
    }

}
