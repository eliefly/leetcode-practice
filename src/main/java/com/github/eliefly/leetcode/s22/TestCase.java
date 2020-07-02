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

    @Test
    public void test02() {
        Solution1 solution = new Solution1();
        List<String> list = solution.generateParenthesis(3);

        System.out.println(list);
    }

    @Test
    public void test03() {
        Solution2 solution = new Solution2();
        List<String> list = solution.generateParenthesis(3);

        System.out.println(list);
    }
}
