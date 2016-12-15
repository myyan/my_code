package com.freeland.util.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by chenhao on 2016/12/15.
 */
public class TestConcurrentHashMap extends Thread {

    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap();

    static {
        map.put("count", 0);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int value = map.get("count");
            map.put("count", value + 1);
        }
    }

    public static int getValue() {
        return map.get("count");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            TestConcurrentHashMap t = new TestConcurrentHashMap();
            t.start();
        }
        Thread.sleep(5000);
        System.out.println(TestConcurrentHashMap.getValue());
    }
}
