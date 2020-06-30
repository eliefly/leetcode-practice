package com.github.eliefly.leetcode.s22;

import org.junit.Test;

import java.util.List;

/**
 * TestCase
 *
 * @author huangfl
 * @date 20/7/1
 */
public class TestCase {

    @Test
    public void test01() {
        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(3);

        System.out.println(list);
    }
}
