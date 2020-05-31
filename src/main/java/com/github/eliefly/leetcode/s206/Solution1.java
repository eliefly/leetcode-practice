package com.github.eliefly.leetcode.s206;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution1
 *
 * @author huangfl
 * @date 20/5/31
 */
public class Solution1 {

    /**
     * 分割拆补
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = head;
            head = cur;
            cur = next;
        }
        return head;
    }
}
