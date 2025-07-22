package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPool {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=1; i<=10; i++){
            final int taskId=i;
            executor.execute(() -> System.out.println("Running Task" + taskId + Thread.currentThread().getName()));

        }
        executor.shutdown();
    }
}
