package com.Multithreading;

import java.util.concurrent.locks.LockSupport;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread started");
            System.out.println("Thread is going to park...");

            LockSupport.park();

            System.out.println("Thread is running again");

        });

        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is unparking t1...");

        LockSupport.unpark(t1);
    }
}