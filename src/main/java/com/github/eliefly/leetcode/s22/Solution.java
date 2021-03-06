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
class Solution {

    private List<String> res = new ArrayList<>();

    // 自己做的
    public List<String> generateParenthesis(int n) {
        backtrack("", 2 * n);
        return res;
    }

    private void backtrack(String s, int n) {
        if (n == 0) {
            if (valid(s.toCharArray())) {
                res.add(s);
            }
            return;
        }
        s = s + "(";
        backtrack(s, n - 1);
        s = s.substring(0, s.length() - 1);
        s = s + ")";
        backtrack(s, n - 1);
    }

    /**
     * 判断括号有效
     *
     * @param current
     * @return
     */
    public boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return (balance == 0);
    }

}