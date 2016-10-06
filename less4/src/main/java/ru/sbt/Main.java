package ru.sbt;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ServletContainer servletContainer=new ServletContainer();
        servletContainer.start();

        for(int i=0; i<1000; i++){
            servletContainer.newUserRequest();
        }
        TimeUnit.SECONDS.sleep(5000);
        servletContainer.stop();
        System.out.println(servletContainer.servlet.atomicInteger);
    }
}
