package com.husseinabdallah.codewars.asynchronous;

import java.util.Random;

import static java.lang.Thread.sleep;

public class AnonymousThread {

    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    try {
                        Random random = new Random();
                        System.out.println("execution time: " + random.nextInt(5000));
                        sleep(random.nextInt(5000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("iteration no:" + i);
                }
            }
        }).start();

    }

}
