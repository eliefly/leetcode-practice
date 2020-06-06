package com.github.eliefly.leetcode.s23;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution3
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class Solution3 {

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int left, int ritht) {
        if (left == ritht) {
            return lists[left];
        }
        if (left > ritht) {
            return null;
        }
        int mid = (left + ritht) / 2;
        return mergeTwoLists(mergeKLists(lists, 0, mid), mergeKLists(lists, mid + 1, ritht));
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        p.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
