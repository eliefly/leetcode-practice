package com.github.eliefly.leetcode.s19;

import com.github.eliefly.leetcode.common.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode pre = dummy;
        while (n-- > 0) {
            cur = cur.next;
        }
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}