package multithreading;

public class World extends Thread {
    @Override
    public void run() {

        Thread t = Thread.currentThread();


        for (;;) {
            System.out.println(t);
        }
    }

}
