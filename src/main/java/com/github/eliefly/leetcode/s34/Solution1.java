package com.github.eliefly.leetcode.s34;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * <p>
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int lowBound = searchLowBound(nums, target);
        if (lowBound == nums.length || nums[lowBound] != target) {
            return res;
        }
        res[0] = lowBound;
        res[1] = searchHighBound(nums, target) - 1;
        return res;
    }

    private int searchLowBound(int[] nums, int target) {
        // 注意 right = nums.length
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int searchHighBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

//    // returns leftmost (or rightmost) index at which `target` should be
//    // inserted in sorted array `nums` via binary search.
//    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
//        int lo = 0;
//        int hi = nums.length;
//
//        while (lo < hi) {
//            int mid = (lo + hi) / 2;
//            if (nums[mid] > target || (left && target == nums[mid])) {
//                hi = mid;
//            }
//            else {
//                lo = mid+1;
//            }
//        }
//
//        return lo;
//    }
//
//    public int[] searchRange(int[] nums, int target) {
//        int[] targetRange = {-1, -1};
//
//        int leftIdx = extremeInsertionIndex(nums, target, true);
//
//        // assert that `leftIdx` is within the array bounds and that `target`
//        // is actually in `nums`.
//        if (leftIdx == nums.length || nums[leftIdx] != target) {
//            return targetRange;
//        }
//
//        targetRange[0] = leftIdx;
//        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;
//
//        return targetRange;
//    }

}