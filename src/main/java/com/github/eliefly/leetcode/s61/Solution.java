package com.github.eliefly.leetcode.s61;

import com.github.eliefly.leetcode.common.ListNode;

class Solution {
    /**
     * 自己写的冗余
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        if (len == 0) {
            return head;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        k = len - k - 1;
        int index = 0;
        cur = head;
        ListNode newTail = head;
        ListNode oldTail = head;
        ListNode newHead = head;
        while (cur != null) {
            if (index == k) {
                newTail = cur;
                newHead = cur.next;
            }
            index++;
            oldTail = cur;
            cur = cur.next;
        }
        oldTail.next = head;
        newTail.next = null;
        return newHead;
    }
}
