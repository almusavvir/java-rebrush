package multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        World world = new World();
        world.start();

        Thread t = Thread.currentThread();
        for(;; ) {
            System.out.println(t);
        }
    }
}
