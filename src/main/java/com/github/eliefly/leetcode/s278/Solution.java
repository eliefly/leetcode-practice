package com.github.eliefly.leetcode.s278;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (!isBadVersion(mid)) {
                low = mid + 1;
            } else {
                if (mid == 1 || !isBadVersion(mid - 1)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}