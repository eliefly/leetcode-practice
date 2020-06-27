package com.github.eliefly.leetcode.s230;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * TestCase
 *
 * @author huangfl
 * @date 20/6/22
 */
public class TestCase {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(3);

        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());

    }

}
