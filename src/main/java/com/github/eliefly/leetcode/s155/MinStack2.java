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
    private Integer min;

    /**
     * initialize your data structure here.
     */
    public MinStack2() {
        this.data = new Stack<>();
        this.helper = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        data.push(x);
        if (x < min) {
            helper.push(x);
        }
    }

    public void pop() {

    }

    public int top() {

    }

    public int getMin() {

    }
}