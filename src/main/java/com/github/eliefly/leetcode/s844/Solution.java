package com.github.eliefly.leetcode.s844;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#') {
                if (!stack1.empty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (c == '#') {
                if (!stack2.empty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        return stack1.equals(stack2);
    }
}