package com.github.eliefly.leetcode.s22;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

    Deque<String> stack = new ArrayDeque<String>();
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 2 * n);
        return res;
    }

    private void backtrack(String s, int n) {
        if (n == 0) {
            res.add(s);
//            for (char ch : s.toCharArray()) {
//                if (ch == '(') {
//                    stack.push("(");
//                } else if (ch == ')') {
//                    stack.pop();
//                }
//            }
//            if (stack.isEmpty()) {
//                res.add(s);
//                stack.clear();
//            }
        }
        for (char ch : s.toCharArray()) {
            int right = 0, left = 0;
            if (ch == '(') {
                left++;
            }
            if (ch == ')') {
                right++;
            }
            if (right > left || left > n - s.length()) {
                return;
            }
        }
        backtrack(s + "(", n - 1);
        backtrack(s + ")", n - 1);
    }
}