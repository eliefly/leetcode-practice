package com.github.eliefly.leetcode.s234;

import com.github.eliefly.leetcode.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

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
class Solution {
    // 笨方法：使用双向队列
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            deque.offer(cur);
            cur = cur.next;
        }
        while (!deque.isEmpty()) {
            ListNode front = deque.pollFirst();
            if (deque.isEmpty()) {
                break;
            }
            ListNode rear = deque.pollLast();
            if (front.val != rear.val) {
                return false;
            }
        }
        return true;
    }
}