package com.github.eliefly.leetcode.s234;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * 输入: 1->2
 * 输出: false
 * <p>
 * 示例 2:
 * 输入: 1->2->2->1
 * 输出: true
 * <p>
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution1 {
    // 空间复杂O(1)的方法
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode firstHalfTail = findMiddleNode(head);
        // 反转后半部分节点
        ListNode secondHalfHead = reverseList(firstHalfTail.next);
        boolean res = true;
        ListNode head1 = head;
        ListNode head2 = secondHalfHead;
        while (res && head2 != null) {
            if (head1.val != head2.val) {
                res = false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        // 再次反转，恢复原有节点次序
        reverseList(secondHalfHead);
        return res;
    }

    /**
     * 快慢指针查找链表的中间节点
     *
     * @param head
     * @return
     */
    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head) {
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