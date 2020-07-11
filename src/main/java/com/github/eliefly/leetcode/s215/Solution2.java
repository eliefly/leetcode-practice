package com.github.eliefly.leetcode.s215;

import java.util.PriorityQueue;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 */
class Solution2 {
//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a - b);
//        for (int i = 0; i < nums.length; i++) {
//            if (heap.size() < k || nums[i] > heap.peek()) {
//                heap.add(nums[i]);
//            }
//            if (heap.size() > k) {
//                heap.poll();
//            }
//        }
//        return heap.peek();
//    }

    public int findKthLargest(int[] nums, int k) {
        // 根据 k 大小选择使用大顶堆还是小顶堆
        if (k < nums.length / 2) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
            for (int i = 0; i < nums.length; i++) {
                if (minHeap.size() < k || nums[i] > minHeap.peek()) {
                    minHeap.add(nums[i]);
                }
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
            return minHeap.peek();
        } else {
            k = nums.length - k + 1;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int i = 0; i < nums.length; i++) {
                if (maxHeap.size() < k || nums[i] < maxHeap.peek()) {
                    maxHeap.add(nums[i]);
                }
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
            return maxHeap.peek();
        }
    }
}