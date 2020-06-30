package com.github.eliefly.leetcode.s17;

import org.junit.Test;

import java.util.List;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/30
 */
public class TestCase {

    @Test
    public void test01() {
        Solution solution = new Solution();
        List<String> res = solution.letterCombinations("23");
        System.out.println(res);
    }

    @Test
    public void test02() {
        Solution1 solution = new Solution1();
        List<String> res = solution.letterCombinations("23");
        System.out.println(res);
    }
}
