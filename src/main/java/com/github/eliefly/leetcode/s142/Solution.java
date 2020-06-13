package com.github.eliefly.leetcode.s142;

import com.github.eliefly.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author huangfl
 * @date 2020/6/13
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode stepOne = head;
        Set<ListNode> listNodes = new HashSet<>();
        while (stepOne != null) {
            listNodes.add(stepOne);
            stepOne = stepOne.next;
            if (listNodes.contains(stepOne)) {
                return stepOne;
            }
        }
        return null;
    }
}