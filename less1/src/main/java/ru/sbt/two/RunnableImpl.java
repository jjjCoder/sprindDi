package ru.sbt.two;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();
    }
}
