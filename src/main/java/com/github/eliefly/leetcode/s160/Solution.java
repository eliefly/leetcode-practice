package com.github.eliefly.leetcode.s160;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution
 *
 * @author huangfl
 * @date 2020/6/15
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != null || pB != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return null;
    }
}