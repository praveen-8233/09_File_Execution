package com.example.reversedNumber;

public class ReversedNumber {
    public static void main(String[] args) {
        int num = 9876;
        int reversedNum = 0;
        int i = 7;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNum);

        // Print the remainder when the reversed number is divided by i
        System.out.println("Remainder when divided by " + i + ": " + reversedNum % i);
    }
}

