package ru.sbt.one;

import java.util.concurrent.TimeUnit;

public class SomeTask implements Runnable {

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
    }
}

