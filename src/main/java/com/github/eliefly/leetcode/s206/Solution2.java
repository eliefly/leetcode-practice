package com.github.eliefly.leetcode.s206;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Solution2
 *
 * @author huangfl
 * @date 20/5/31
 */
public class Solution2 {

    /**
     * 双指针滑动
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
