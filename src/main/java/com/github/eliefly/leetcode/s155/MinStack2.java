package com.github.eliefly.leetcode.s155;

import java.util.Stack;

/**
 * MinStack2
 *
 * @author huangfl
 * @date 2020/6/13
 */
public class MinStack2 {

    private Stack<Integer> data;
    private Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public MinStack2() {
        this.data = new Stack<>();
        this.helper = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (helper.isEmpty() || x <= getMin()) {
            helper.push(x);
        }
    }

    public void pop() {
        int ele = data.pop();
        if (ele == getMin()) {
            helper.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}