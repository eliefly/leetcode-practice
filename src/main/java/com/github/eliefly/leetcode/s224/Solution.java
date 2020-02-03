package com.github.eliefly.leetcode.s224;

import java.util.HashMap;
import java.util.Stack;

class Solution {

    private HashMap<Character, Integer> map = new HashMap<>();

    Solution() {
        map.put('+', 1);
        map.put('-', 1);
        map.put('(', 9);
        map.put(')', 9);

    }

    public int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            if (map.containsKey(ele)) {
            } else if (ele == ' ') {
                continue;
            } else {
            }

        }

        return 0;
    }

    private int compareOperator(Character op1, Character op2) {
        return map.get(op1).compareTo(map.get(op2));
    }
}