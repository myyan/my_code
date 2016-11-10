package com.freeland.util.code;

/**
 * Created by chenhao on 2016/10/11.
 */
public class ListNode<T> {
    T val;
    ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
    }

    public ListNode(T val, ListNode<T> next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }
}
