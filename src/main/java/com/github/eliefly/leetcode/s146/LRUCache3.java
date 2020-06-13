package com.github.eliefly.leetcode.s146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRUCache3
 *
 * @author huangfl
 * @date 2020/6/13
 */
class LRUCache3 {

    private Map<Integer, Integer> cache;

    public LRUCache3(int capacity) {
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return cache.size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}

