package com.github.eliefly.leetcode.s43;

/**
 * Solution2
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class Solution2 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] arr = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + arr[i + j + 1];
                arr[i + j + 1] = sum % 10;
                // 不是很理解这里
                arr[i + j] = arr[i + j] + sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] == 0) {
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

}
