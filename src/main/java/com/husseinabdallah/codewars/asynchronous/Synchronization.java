package com.husseinabdallah.codewars.asynchronous;


class Brackets{

    private final Object lock = "lock";
     public void generate() {
        synchronized (lock){
            for (int i = 1; i <= 20 ; i++) {
                if (i <= 10){
                    System.out.print('[');
                } else {
                    System.out.print(']');
                }
            }
            System.out.println();
        }
        }
}


public class Synchronization {
    public static void main(String[] args){
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    brackets.generate();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    brackets.generate();
                }
            }
        }).start();
    }
}
