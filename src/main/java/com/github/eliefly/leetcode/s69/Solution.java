package com.github.eliefly.leetcode.s69;

public class Solution {

    public int mySqrt(int x) {
        // 注意：针对特殊测试用例，例如 2147395599
        // 要把搜索的范围设置成长整型
        // 为了照顾到 0 把左边界设置为 0
        long left = 0;
        // # 为了照顾到 1 把右边界设置为 x // 2 + 1
        long right = x / 2 + 1;
        while (left < right) {
            // 注意：这里一定取右中位数，如果取左中位数，代码会进入死循环
            // long mid = left + (right - left + 1) / 2;
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        // 因为一定存在，因此无需后处理
        return (int) left;
    }

}

//class Solution {
//    public int mySqrt(int x) {
//        return (int) Math.sqrt(x);
//    }
//}

//class Solution {
//    public int mySqrt(int x) {
//        if (x == 0 || x == 1) {
//            return x;
//        }
//        long low = 0;
//        long high = x / 2;
//        long mid = 0;
//        while (low <= high) {
//            mid = low + ((high - low) >> 1);
//            long sqrt = mid * mid;
//            if (sqrt == x) {
//                return (int) mid;
//            } else if (sqrt > x) {
//                high = mid - 1;
//                if (high * high < x) {
//                    return (int) high;
//                }
//            } else if (sqrt < x) {
//                low = mid + 1;
//                if (low * low > x) {
//                    return (int) mid;
//                }
//            }
//
//        }
//        return (int) mid;
//    }
//}
