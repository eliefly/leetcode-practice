package com.github.eliefly.leetcode.s22;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例：
 * <p>
 * 输入：n = 3
 * 输出：[
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution1 {

    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 2 * n);
        return res;
    }

    // 自己做的
    private void backtrack(String s, int k) {
        int close = 0, open = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            }
            if (ch == ')') {
                close++;
            }
        }
        if (close > open || open - close > k) {
            return;
        }
        if (k == 0) {
            res.add(s);
            return;
        }
        s = s + "(";
        backtrack(s, k - 1);
        s = s.substring(0, s.length() - 1);
        s = s + ")";
        backtrack(s, k - 1);
    }
}