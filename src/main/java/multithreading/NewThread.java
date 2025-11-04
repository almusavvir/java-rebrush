package multithreading;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class NewThread extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
    }

    public static void main(String[] args) throws InterruptedException {
        NewThread t1 = new NewThread();

        System.out.println("Below listed are live Thread states ⬇️\n");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSSSSSS");

        System.out.println(now.format(formatter));
        System.out.println(t1.getState());
        System.out.println(now.format(formatter));
        t1.start();
        System.out.println(t1.getState());
        System.out.println(now.format(formatter));
    }

}
