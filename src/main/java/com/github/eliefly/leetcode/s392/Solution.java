package com.github.eliefly.leetcode.s392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = 0;
        int i = 0;
        while (i < t.length()) {
            if (m == s.length()) {
                return true;
            }
            if (s.charAt(m) == t.charAt(i)) {
                m++;
            }
            i++;
        }
        return m == s.length();
    }

//    public boolean isSubsequence(String s, String t) {
//        int m = 0;
//        int i = 0;
//        while (i < t.length()) {
//            if (m == s.length()) {
//                return true;
//            }
//            if (s.charAt(m) == t.charAt(i)) {
//                m++;
//            }
//            i++;
//
//        }
//        return m == s.length();
//    }

}