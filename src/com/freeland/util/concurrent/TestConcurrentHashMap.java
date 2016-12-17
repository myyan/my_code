package com.freeland.util.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by chenhao on 2016/12/15.
 */
public class TestConcurrentHashMap extends Thread {

    private static ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap();

    //    private static AtomicInteger integer = new AtomicInteger(0);
    static {
        map.put("count",0);
    }



    @Override
    public void run() {
        int v = 0;
        for (int i = 0; i < 100; i++) {
            int value = map.get("count");
            map.put("count", value +1);
        }

    }

    public static int getValue() {
        return map.get("count").intValue();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            TestConcurrentHashMap t = new TestConcurrentHashMap();
            t.start();
//            t.join();
        }
        Thread.sleep(3000);
        System.out.println(TestConcurrentHashMap.getValue());
    }
}
