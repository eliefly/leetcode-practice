package com.github.eliefly.leetcode.s11;

/**
 * Solution2
 *
 * @author huangfl
 * @date 20/5/2
 */
public class Solution2 {
    public int maxArea(int[] height) {
        int maxArea = 0, front = 0, rear = height.length - 1;
        while (front < rear) {
            maxArea = Math.max(maxArea, Math.min(height[front], height[rear]) * (rear - front));
            if (height[front] > height[rear]) {
                rear--;
            } else {
                front++;
            }
        }
        return maxArea;
    }
}
