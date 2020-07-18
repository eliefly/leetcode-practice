package com.github.eliefly.leetcode.s394;

import java.util.LinkedList;

/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 * 示例 1：
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * <p>
 * 示例 2：
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
   /* public String decodeString(String s) {
        LinkedList<Integer> stackMulti = new LinkedList<>();
        LinkedList<String> stackRes = new LinkedList<>();
        int multi = 0;
        String res = "";
        for (Character ch : s.toCharArray()) {
            if (ch == '[') {
                stackMulti.addLast(multi);
                stackRes.addLast(res);
                multi = 0;
                res = "";
            } else if (ch == ']') {
                String tmp = "";
                int curMulti = stackMulti.removeLast();
                for (int i = 0; i < curMulti; i++) {
                    tmp = tmp + res;
                }
                res = stackRes.removeLast() + tmp;
            } else if (Character.isDigit(ch)) {
                multi = multi * 10 + ch - '0';
            } else if (Character.isLetter(ch)) {
                res = res + ch;
            }
        }
        return res;
    }*/

    public String decodeString(String s) {
        LinkedList<Integer> stackMulti = new LinkedList<>();
        LinkedList<String> stackRes = new LinkedList<>();
        int multi = 0;
        StringBuilder res = new StringBuilder();
        for (Character ch : s.toCharArray()) {
            if (ch == '[') {
                stackMulti.addLast(multi);
                stackRes.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder tmp = new StringBuilder();
                Integer curMulti = stackMulti.removeLast();
                for (int i = 0; i < curMulti; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stackRes.removeLast() + tmp);
            } else if (ch >= '0' && ch <= '9') {
                multi = multi * 10 + ch - '0';
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}