package ru.sbt.three;

public class Account {
    private int balance=50;

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
}
class Main{
    private static Account account=new Account();
    public static void main(String[] args) {
        Runnable runnable=new RunnableImpl(account);
        for(int i=0; i<20; i++){
            Thread thread=new Thread(runnable);
            thread.start();
        }
    }

}
class RunnableImpl implements Runnable{
    Account account;
    RunnableImpl(Account account){
        this.account=account;
    }
    @Override
    public void run() {
        for(int x=0; x<5; x++){
            makeWithdrawal(10);
            if(account.getBalance()<0){
                System.out.println("account is overdrawn!");
                return;
            }
        }
    }
    private synchronized void makeWithdrawal(int amt){
        if(account.getBalance()>=amt){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(amt);
        }
    }
}
