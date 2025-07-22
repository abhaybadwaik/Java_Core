class MyThread1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From MyThread1:" + i);
        }
    }
}
class MyRunnable implements Runnable{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("From MyRunnable:" + j);
        }
    }
}

public class MultitredingCode {
    public static void main(String[] args) {
        // Using Thread class
        MyThread1 t1 = new MyThread1();
        t1.start();

        // Using Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();
    }
}