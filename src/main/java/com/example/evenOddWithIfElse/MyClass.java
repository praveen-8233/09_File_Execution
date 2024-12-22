package com.example.evenOddWithIfElse;

import java.util.Arrays;
import java.util.List;

public class MyClass {



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,3,12,45,67,98);
        for(int num : list){
            if(num%2==0){
                System.out.println("This is my even number : " + num);
            }else{
                System.out.println("This is my odd number : " + num);
            }
        }

    }
}
