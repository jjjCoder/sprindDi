package ru.sbt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ServletContainer {
    public static final int N_THREADS = 100;
    private ScheduledExecutorService executorService;
     Servlet servlet=new Servlet();

     void start(){
        executorService= Executors.newScheduledThreadPool(N_THREADS);
         executorService.schedule(()-> System.out.println("tik"), 1, TimeUnit.SECONDS);
    }
    void stop(){
            executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void newUserRequest(){
        executorService.submit(()->servlet.handle());
    }
}
