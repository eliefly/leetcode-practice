package com.github.eliefly.leetcode.s20;

import java.util.HashMap;
import java.util.Stack;

//class Solution {
//    public boolean isValid(String s) {
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        for (char ch : chars) {
//            if (ch == ')' || ch == ']' || ch == '}') {
//                // 还有右边括号，但栈内的左边括号已经空了
//                if (stack.empty()) {
//                    return false;
//                }
//                Character pop = stack.pop();
//                if (ch == ')' && !pop.equals('(')) {
//                    return false;
//                } else if (ch == ']' && !pop.equals('[')) {
//                    return false;
//                } else if (ch == '}' && !pop.equals('{')) {
//                    return false;
//                }
//            } else {
//                stack.push(ch);
//            }
//        }
//        return stack.empty();
//    }
//}

class Solution {

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
}
