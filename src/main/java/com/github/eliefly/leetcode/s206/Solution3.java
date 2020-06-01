package com.github.eliefly.leetcode.s206;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution3
 *
 * @author huangfl
 * @date 20/5/31
 */
public class Solution3 {

    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
