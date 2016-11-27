package com.freeland.util.sort;

/**
 * Created by chenhao on 2016/11/15.
 */
public class InsertSort {
    public static void main(String[] args) throws InterruptedException {
        int a = 1;
        int b = 2;
        System.out.println(a);
        printC();
        System.out.println(b);
    }

    public static void printC() throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(3);
            }
        }).start();
    }
}
