package com.github.eliefly.leetcode.s206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // public ListNode reverseList(ListNode head) {
    //     if ( head == null) {
    //         return null;
    //     }
    //    ListNode tail =  head;
    //    ListNode newHead = head;
    //    ListNode oldHead = head;
    //    while (tail.next != null) {
    //        newHead = tail.next;
    //        tail.next = tail.next.next;
    //        newHead.next = oldHead;
    //        oldHead = newHead;
    //    }
    //    return oldHead;
    // }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}