package com.github.eliefly.leetcode.s146;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache1 {

    private Map<Integer, Integer> cache;

    public LRUCache1(int capacity) {
        this.cache = Collections.synchronizedMap(new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        });
    }

    public int get(int key) {
        return this.cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        this.cache.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */