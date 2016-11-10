package com.freeland.util.performance;

import java.util.Arrays;

/**
 * Created by chenhao on 2016/9/29.
 */
public class Single {
    public static void dddd() throws InterruptedException {
        System.out.println("entry dddd");
        Single1.test();
        System.out.println("exit dddd");
    }

    public static void main(String[] args) throws InterruptedException {
        Arrays.asList(1,2,3).stream().forEach(x ->{
          new Thread(new Runnable() {
              @Override
              public void run() {
                  try {
                      dddd();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }).start();
        });
    }
}

