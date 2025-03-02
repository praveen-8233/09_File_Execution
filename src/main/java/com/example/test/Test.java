package com.example.test;


public class Test {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 0};

        // Loop over each element
        for (int i = 0; i < a.length; i++) {
            // Compare the current element with the elements that follow it
            for (int j = i + 1; j < a.length; j++) {
                // If the element at i is greater than the element at j, swap them
                if (a[i] > a[j]) {
                    int temp = a[i];//assign the value in temp location
                    a[i] = a[j];//changing index with each other
                    a[j] = temp;//placing value in the new location
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
