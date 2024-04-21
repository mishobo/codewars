package com.husseinabdallah.codewars;

import static com.husseinabdallah.codewars.CodeWars.getOddOccurrence;
import static com.husseinabdallah.codewars.CodeWars.mask;

public class CodeWars {


    public static String mask (String str){
        return str.replaceAll(".(?=.{4})", "#");
    }

    static int getOddOccurrence(int arr[], int arr_size){
        for(int i = 0; i < arr_size; i++){
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }


}

class Main1{
    public static void main (String[] args){

        String str =  mask("12345678987654321");

        System.out.println(str);

        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;

        int i = getOddOccurrence(arr, n);

        System.out.println(i);

    }

}


