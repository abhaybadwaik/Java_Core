package Threads;

public class ThreadDD extends Thread{
    public void run(){
        System.out.println("THis thread is running");
    }

    public static void main(String[] args) {
        ThreadDD t = new ThreadDD();
        t.start();
    }
}
