package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutors {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("Task 1-"+Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Task 2-"+Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Task 3-"+Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Task 4-"+Thread.currentThread().getName()));

        executor.shutdown();
    }
}
