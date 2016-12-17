package com.freeland.util.concurrent;

/**
 * Created by chenhao on 2016/12/17.
 */
public class NoVisibility {
    private  static boolean ready=false;
    private  static int num;



    private static class ReaderThread extends Thread{
        @Override
        public void run(){
            System.out.println("entry run");
            System.out.println(ready);
            while (!ready){
                System.out.println("entry thread");
                Thread.yield();
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(1000);
        num=10;
        ready=true;
    }

}
