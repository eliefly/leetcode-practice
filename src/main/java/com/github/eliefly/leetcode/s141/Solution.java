package com.github.eliefly.leetcode.s141;

import com.github.eliefly.leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode stepOne = head;
        ListNode stepTwo = head;
        while (stepOne != null && stepTwo != null && stepTwo.next != null) {
            stepOne = stepOne.next;
            stepTwo = stepTwo.next.next;
            if (stepOne == stepTwo) {
                return true;
            }
        }
        return false;
    }
}