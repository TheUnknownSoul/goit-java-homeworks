package org.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class TimeCounter {
    /**
     * Class AtomicInteger and variable COUNTER were used for synchronization between threads.
     * It allows to use only one instance of variable for operations
     */
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (COUNTER.get() % 5 == 0) {
                    System.out.println("5 seconds passed");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (COUNTER.get() % 5 != 0) {
                    System.out.println(COUNTER);
                }
                COUNTER.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
