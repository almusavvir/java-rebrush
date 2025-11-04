package multithreading;

public class CurrentThreadDemo {

    //controlling the Java's main thread
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        //prints the current thread
        System.out.println("\nCurrent Thread -> " + t);

        //renaming the main thread
        t.setName("msvr's thread");
        System.out.println("After renaming -> " +t);
        // the output from above will be in the format [thread_name, priority, thread_group_name]

        try {
            for (int n=5; n >0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }  catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Execution completed");
    }
}
