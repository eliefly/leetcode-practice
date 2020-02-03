package com.github.eliefly.leetcode.s641;

class MyCircularDeque {

    private int[] data;
    private int head = 0;
    private int tail = 0;
    private int n = 0;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        n = k + 1;
        data = new int[n];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        head = (head - 1 + n) % n;
        data[head] = value;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail + 1) % n;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % n;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + n) % n;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return data[head];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return data[(tail - 1 + n) % n];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return head == tail;

    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return (tail + 1) % n == head;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */