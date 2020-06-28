package com.github.eliefly.leetcode.s4;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * <p>
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int midIndex = totalLen / 2;
        int index = 0, p1 = 0, p2 = 0;
        double tmp = 0, a = 0, b = 0;
        while (index <= midIndex) {
            if (p1 >= nums1.length) {
                tmp = nums2[p2];
                p2++;
            } else if (p2 >= nums2.length) {
                tmp = nums1[p1];
                p1++;
            } else if (nums1[p1] >= nums2[p2]) {
                tmp = nums2[p2];
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                tmp = nums1[p1];
                p1++;
            }
            if (index == midIndex - 1) {
                a = tmp;
            }
            if (index == midIndex) {
                b = tmp;
            }
            index++;
        }
        return totalLen % 2 == 0 ? ((a + b) / 2) : b;
    }
}