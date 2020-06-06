package com.github.eliefly.leetcode.s23;

import com.github.eliefly.leetcode.common.ListNode;

import java.util.PriorityQueue;

/**
 * Solution2
 *
 * @author huangfl
 * @date 2020/6/6
 */
public class Solution2 {

    /**
     * 最小堆（优先级队列）
     * O(nlogn*l)
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.val, o2.val));
        for (ListNode list : lists) {
            if (list != null) {
                priorityQueue.add(list);
            }
        }
        while (!priorityQueue.isEmpty()) {
            head.next = priorityQueue.poll();
            head = head.next;
            if (head.next != null) {
                priorityQueue.add(head.next);
            }
        }
        return dummy.next;
    }

}
