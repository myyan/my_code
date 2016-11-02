package asd.util.performance;

/**
 * Created by chenhao on 2016/9/29.
 */
public class Single1 {
    public static void test() throws InterruptedException {
        System.out.println("entry test");
        Thread.currentThread().sleep(5000);
        System.out.println("exit test");
    }
}
