package com.husseinabdallah.codewars;

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
