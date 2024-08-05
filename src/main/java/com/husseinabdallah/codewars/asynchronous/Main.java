package com.husseinabdallah.codewars.asynchronous;

import lombok.Data;

import java.util.Random;

import static java.lang.Thread.sleep;

@Data
class MyCounter implements Runnable{
    // extend = inheritance a pillar of java OOP, inherits threads functionalities
    // implements = used in abstraction: implementation of a method is done separately

    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Random random = new Random();
                System.out.println("execution time: " + random.nextInt(5000));
                sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread no: " + threadNo + ", iteration no:" + i);
        }
    }

}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        // creational design pattern (provides solution how to instantiate an object)
        // singleton(restricts instantiation of a class and ensures only one of the class exists in the JVM),
        // factory, abstract factory, builder, prototype
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();
    }

}
