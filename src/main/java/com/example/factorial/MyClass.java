package com.example.factorial;

public class MyClass {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for(int i = 1;i <= num;i++){
            fact = i * fact;
        }
        System.out.println(fact);
    }
}
