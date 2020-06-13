package com.github.eliefly.leetcode.s146;

/**
 * TestCase
 *
 * @author huangfl
 * @date 2020/6/13
 */
public class TestCase {

    public static void main(String[] args) {
        LRUCache4 cache = new LRUCache4(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));      // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        System.out.println(cache.get(1));      // 返回 -1 (未找到)
        System.out.println(cache.get(3));     // 返回  3
        System.out.println(cache.get(4));       // 返回  4

    }

}
