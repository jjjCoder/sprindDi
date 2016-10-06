package ru.sbt;

import java.util.concurrent.atomic.AtomicInteger;

public class Servlet {
    AtomicInteger atomicInteger=new AtomicInteger(0);
    public void handle(){
        atomicInteger.incrementAndGet();
    }
}
