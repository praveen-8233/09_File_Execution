package com.example.tablesWithForLoop;

public class MyClass {

    public static void main(String[] args) {
        int num = 2;
        for(int i = 1; i <= 10;i++){
            System.out.println("This is my table of " + num + " * " + i + " : " + num * i);
        }
    }
}
