package com.example.recursiveMethodFactoirial;

public class RecursiveMethodFactorial {

    public static void main(String[] args) {
        int a = factorial(5);
        System.out.println("This is the factorial of given number : " + a);
    }
    public static int factorial(int b){
        if(b>1){
            return b*factorial(b-1);
        }else {
            return 1;
        }
    }
}
