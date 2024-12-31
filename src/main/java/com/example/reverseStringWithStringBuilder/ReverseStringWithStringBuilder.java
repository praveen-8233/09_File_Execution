package com.example.reverseStringWithStringBuilder;

public class ReverseStringWithStringBuilder {

    public static void main(String[] args) {
        String str = "PRAVEEN";
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);

    }
}
