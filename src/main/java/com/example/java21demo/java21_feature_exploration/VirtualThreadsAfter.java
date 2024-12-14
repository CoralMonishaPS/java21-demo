package com.example.java21demo.java21_feature_exploration;

import java.util.concurrent.Executors;

/**
 * Represents importance of Virtual Threads.
 *
 * @author Coral Monisha P S
 * @version 1.0
 * @since 2024
 * Benefits:
 * Lightweight
 * JVM can handle more virtual threads
 * Virtual threads are managed by JVM scheduler, freeing you from manually tuning thread pool sizes
 */
public class VirtualThreadsAfter {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 100; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " is executing");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }
}
