package com.freeland.util.effective;

/**
 * Created by chenhao on 2016/11/10.
 */
public class Base {

    public void printBefore() {
        System.out.println("before");
    }

    public void print() {
        printBefore();
        System.out.println("print base");
        printAfter();
    }

    public void printAfter() {
        System.out.println("after");
    }
}
