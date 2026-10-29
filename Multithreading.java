
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class: " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable interface: " + i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
