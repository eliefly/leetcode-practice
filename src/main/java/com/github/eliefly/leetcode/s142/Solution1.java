package com.github.eliefly.leetcode.s142;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution1
 *
 * @author huangfl
 * @date 2020/6/13
 */
public class Solution1 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}