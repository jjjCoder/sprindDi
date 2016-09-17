package ru.sbt.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

    }
}

class Account{
    ReentrantLock lock=new ReentrantLock();
    long balance;
    public Account(long balance){
        this.balance=balance;
    }
    public void withdraw(long amount){
        lock.lock();
        try{
            balance=balance-amount;
        }finally {
            lock.unlock();
        }
    }
}