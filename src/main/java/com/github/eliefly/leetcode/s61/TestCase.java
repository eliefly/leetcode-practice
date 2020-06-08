package com.github.eliefly.leetcode.s61;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/8
 */
public class TestCase {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        listNode.next = new ListNode(2);

        ListNode res = solution.rotateRight(head, 1);
        System.out.println(res);

    }

}
