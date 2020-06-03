package com.github.eliefly.leetcode.s14;

class Solution {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(strings);
        System.out.println(s);
    }

    /**
     * 自己写的-迭代
     *
     * @param strs
     * @return
     */
/*    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            prefix = commonPrefix(prefix, strs[i]);
            if ("".equals(prefix)) {
                return prefix;
            }
        }
        return prefix;
    }

    private String commonPrefix(String prefix, String str) {
        int length = Math.min(prefix.length(), str.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            if (prefix.charAt(i) == str.charAt(i)) {
                res.append(prefix.charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }*/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}