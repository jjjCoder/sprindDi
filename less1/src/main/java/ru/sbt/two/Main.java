package ru.sbt.two;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new RunnableImpl());

        thread.start();
        Thread.sleep(100);
        System.out.println(thread.getState());
    }
}
