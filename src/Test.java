import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by maxtropy on 2016/8/19.
 */
public class Test {


    public static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            String tid = String.valueOf(Thread.currentThread().getId());
            System.out.println("thread:" + tid + " is running");
            return tid;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<String>> results = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            results.add(executorService.submit(new Task()));
        }
        for (Future<String> result:results){
            System.out.println(result.get());
        }
    }
}
