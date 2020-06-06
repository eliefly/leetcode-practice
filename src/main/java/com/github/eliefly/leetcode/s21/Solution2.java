package com.github.eliefly.leetcode.s21;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution2
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val >= l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}
