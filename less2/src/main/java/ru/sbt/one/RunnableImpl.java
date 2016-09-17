package ru.sbt.one;

import java.util.concurrent.TimeUnit;

public class RunnableImpl implements  Runnable {
    private boolean endFlag=false;
    public int k=0;
    public synchronized void setFlag(boolean flag){
        endFlag=flag;
    }
    public synchronized boolean getFlag(){
        return endFlag;
    }
    public void end(){
        setFlag(true);
    }
    @Override
    public void run() {

        while(!getFlag()){
            double count=0;
            for(int i=0; i<100000; i++){
                count=count+Math.PI;
                k++;
            }
        }
        System.out.println(k);
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException {
        RunnableImpl r=new RunnableImpl();
        Thread thread=new Thread(r);
        System.out.println("Start");
        thread.start();
        Thread.sleep(100);
        r.end();
        System.out.println(r.k);
    }
}