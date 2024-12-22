package com.example.anagram;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        String str1 = new String("Nitin");
        String str2 = new String("eePravn");
        anagram(str1,str2);
    }
    public static Boolean anagram(String str1, String str2){
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        Boolean result = Arrays.equals(array1,array2);
        if(result){
            System.out.println("Both are anagram");
        }else {
            System.out.println("Both are not anagram");
        }
        return false;
    }
}
