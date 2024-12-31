package com.example.recursiveMethod;

public class RecursiveMethod {
    public static void main(String[] args) {
    int a = sum(5);
    System.out.println("this is sum of natural numbers : " + a );
    }
    public static int sum(int b){
        if(b>0){
            return b+sum(b-1);
        }else{
            return 0;
        }
    }
}
