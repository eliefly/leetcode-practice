package com.github.eliefly.leetcode.s5;

/**
 * Solution
 *
 * @author huangfl
 * @date 20/5/31
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "";
        String s1 = solution.longestPalindrome(s);
        System.out.println(s1);

    }

    /**
     * 动态规划
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        if (length < 2) {
            return s;
        }
        int index = 0, maxLen = 1;
        boolean[][] arr = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            arr[i][i] = true;
        }

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                int len = j - i + 1;
                if (s.charAt(i) == s.charAt(j) && (len == 2 || arr[i + 1][j - 1])) {
                    arr[i][j] = true;
                    if (len > maxLen) {
                        index = i;
                        maxLen = len;
                    }
                }
            }
        }
        return s.substring(index, index + maxLen);
    }
}
