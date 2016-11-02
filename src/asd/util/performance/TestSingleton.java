package asd.util.performance;

/**
 * Created by chenhao on 2016/9/29.
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Person.getPerson().doSomething();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }


    }
}
