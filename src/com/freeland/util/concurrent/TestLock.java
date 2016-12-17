package com.freeland.util.concurrent;

/**
 * Created by chenhao on 2016/12/17.
 */
public class TestLock {

    public synchronized void methodA() throws InterruptedException {
        System.out.println("entry method A");
        Thread.sleep(1000);
        System.out.println("do method A");
    }

    public void methodB(){
        System.out.println("method B");
    }

    public synchronized void methodE(){
        System.out.println("do method E");
    }

    public synchronized static void methodC() throws InterruptedException {
        System.out.println("entry method C");
        Thread.sleep(1000);
        System.out.println("do method C");
    }

    public void methodD(){
        synchronized (this){
            System.out.println("method D");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        TestLock t = new TestLock();
//        t.methodA();
        new NewTestThread().start();
        new Thread1(t).start();
        new TestThread(t).start();

//        TestLock.methodC();
//        TestLock.methodC();
    }
}

class TestThread extends Thread{
    TestLock testLock;

    public TestThread(TestLock testLock) {
        this.testLock = testLock;
    }

    @Override
    public void run(){
        testLock.methodE();
    }
}
class NewTestThread extends Thread{
    @Override
    public void run(){
        try {
            TestLock.methodC();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread{
    TestLock lock;

    public Thread1(TestLock lock) {
        this.lock = lock;
    }

    @Override
    public void run(){
        try {
            lock.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}