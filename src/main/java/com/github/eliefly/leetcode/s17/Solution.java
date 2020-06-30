package com.github.eliefly.leetcode.s17;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 示例:
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> oldList = new ArrayList<String>() {{
            add("");
        }};
        List<String> newList = new ArrayList<>();
        String[] alphabetMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (char digit : digits.toCharArray()) {
            newList.clear();
            String alphabets = alphabetMap[digit - '0'];
            for (char apphabet : alphabets.toCharArray()) {
                for (String s : oldList) {
                    newList.add(s + apphabet);
                }
            }
            oldList.clear();
            oldList.addAll(newList);
        }
        return newList;
    }
}