package com.github.eliefly.leetcode.s148;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 快慢指针找到中点
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rHead = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rHead);
        // 合并两个有序链表
        ListNode ptr = new ListNode(0);
        ListNode dummy = ptr;
        while (left != null && right != null) {
            if (left.val >= right.val) {
                ptr.next = right;
                right = right.next;
            } else {
                ptr.next = left;
                left = left.next;
            }
            ptr = ptr.next;
        }

        ptr.next = left == null ? right : left;
        return dummy.next;
    }
}