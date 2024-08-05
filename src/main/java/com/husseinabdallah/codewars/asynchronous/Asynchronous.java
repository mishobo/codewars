package com.husseinabdallah.codewars.asynchronous;

public class Asynchronous {

    public static void thread(){
        int number = 7;
//        Thread newThread = new Thread(() -> {
            System.out.println("Factorial of " + number + " is: " + factorial(number));
//        });
//        newThread.start();
    }

    public static long factorial(int number) {
        long result = 1;

        for(int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }


    public static void main(String args[]){
        thread();
    }

}
