package com.example.checkPalindromeWithStringBuilder;

public class CheckPalindromeWithStringBuilder {
    public static void main(String[] args) {
        String str = "mADAM";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }
}
