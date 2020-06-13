package com.github.eliefly.leetcode.s141;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution1
 *
 * @author huangfl
 * @date 2020/6/13
 */
public class Solution1 {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }
}