package com.github.eliefly.leetcode.s682;

import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String str : ops) {
            if ("C".equals(str)) {
                int score = stack.pop();
                sum = sum - score;
            } else if ("D".equals(str)) {
                int score = stack.peek() * 2;
                stack.push(score);
                sum = sum + score;
            } else if ("+".equals(str)) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.peek();
                stack.push(pop1);
                int score = pop1 + pop2;
                stack.push(score);
                sum = sum + score;
            } else {
                int score = Integer.parseInt(str);
                stack.push(score);
                sum += score;
            }
        }
        return sum;
    }
}