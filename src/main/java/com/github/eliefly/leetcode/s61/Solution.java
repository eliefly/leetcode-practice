package com.github.eliefly.leetcode.s61;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            index++;
            cur = cur.next;
        }
        if (index == 0) {
            return head;
        }
        k = k % index;
        if (k == 0) {
            return head;
        }
        index = 0;
        cur = head;
        ListNode mark = head;
        ListNode newHead = head;
        while (cur.next != null) {
            if (index == k) {
                mark = cur;
                newHead = cur.next;
            }
            index++;
            cur = cur.next;
        }
        cur.next = head;
        mark.next = null;
        return newHead;
    }
}