package com.github.eliefly.leetcode.s61;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/6/8
 */

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oldTail = head;
        int len = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            len++;
        }
        // 闭环
        oldTail.next = head;
        int index = len - k % len - 1;
        ListNode newTail = head;
        for (int i = 0; i < index; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}