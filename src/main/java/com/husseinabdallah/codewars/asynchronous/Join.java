package com.husseinabdallah.codewars.asynchronous;

public class Join {
    public static int counter1 = 0;
    public static int counter2 = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter1++;
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter2++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread.join();
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("counter1 :" + counter1);
                System.out.println("counter2 :" + counter2);
            }
        });

        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("main thread name :" + Thread.currentThread().getName());

    }
}
