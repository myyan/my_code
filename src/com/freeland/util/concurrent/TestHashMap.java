package com.freeland.util.concurrent;

import java.util.HashMap;

/**
 * Created by chenhao on 2016/12/15.
 */
public class TestHashMap extends Thread {

    private static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("count", 0);
    }

    public static int getValue() {
        return map.get("count");
    }

    public TestHashMap(HashMap<String, Integer> map) {
        this.map = map;
    }

    public TestHashMap() {
    }

    @Override
    public void run() {
        synchronized (map) {

            for (int i = 0; i < 100; i++) {

                map.put("count", map.get("count") + 1);

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("count", 0);
        for (int i = 0; i < 1000; i++) {
            new TestHashMap().start();
        }
        Thread.sleep(2000);
        System.out.println(TestHashMap.getValue());
    }
}
