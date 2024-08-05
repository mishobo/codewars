package com.husseinabdallah.codewars.asynchronous;

public class WaitAndNotify {
    public static int balance = 0;

    synchronized  public void withdraw(int amount) throws InterruptedException {
        if( balance <= 0 ){
            System.out.println("Waiting for amount to be updated after withdrawal of $"+amount);
            wait();
        }
        balance = balance - amount;
        System.out.println("The current balance is $" + balance);
    }

    public void deposit(int amount){
        synchronized (this){
            System.out.println("we are depositing the amount in the bank $"+amount);
            balance = balance + amount;
            notify();
        }
    }


    public static void main(String[] args){
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.setName("Thread 1");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                waitAndNotify.deposit(2000);
            }
        });

        thread2.setName("Thread 2");
        thread2.start();
    }
}
