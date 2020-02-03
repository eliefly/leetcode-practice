package com.github.eliefly.leetcode.s1137;

import java.util.HashMap;

class Solution {

    private HashMap<Integer, Integer> map = new HashMap<>();

    public int tribonacci(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int ret = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        map.put(n, ret);
        return ret;
    }
}