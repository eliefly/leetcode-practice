package com.github.eliefly.leetcode.s8;

class Solution {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        boolean negative = false;
        int i = 0;
        if (chars[0] == '-') {
            ++i;
            negative = true;
        }
        if (chars[0] == '+') {
            ++i;
        }
        int res = 0;
        int remain1 = Integer.MAX_VALUE % 10;
        int remain2 = Integer.MIN_VALUE % 10 * -1;
        for (; i < chars.length; ++i) {
            char ch = chars[i];
            if (ch >= '0' && ch <= '9') {
                int addNumber = ch - '0';
                if (negative) {
                    int tmp = res * -1;
                    if (tmp < Integer.MIN_VALUE / 10 || (tmp == Integer.MIN_VALUE / 10 && addNumber > remain2)) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && addNumber > remain1)) {
                        return Integer.MAX_VALUE;
                    }
                }
                res = res * 10 + addNumber;
                continue;
            }
            break;
        }
        return negative ? res * -1 : res;
    }

}