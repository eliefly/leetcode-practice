package com.github.eliefly.leetcode.s89;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /**
     * 看答案做的
     *
     * @param n
     * @return
     */
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>() {{
            add(0);
        }};
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) + prefix);
            }
            prefix = prefix << 1;
        }
        return res;
    }
}