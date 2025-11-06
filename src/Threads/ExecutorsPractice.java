package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable
{
    public void run()
    {

    }
}
class B extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(5000);
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread awaked");
        }
    }
}
public class ExecutorsPractice {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=()->
        {

        };
        Thread thread=new Thread(runnable);
        thread.start();

        B b=new B();
        b.start();
        b.interrupt();
        b.join();
        System.out.println("Namaste");

        ExecutorService executorService=Executors.newFixedThreadPool(10);
        executorService.submit(new Aa());
        executorService.submit(new Aa());
        executorService.shutdown();

    }
}

class Aa implements Runnable
{
    public void run()
    {
        System.out.println();
        for(int i=1;i<1000;i++)
        {

        }
    }
}