package com.example.multiplyWithStream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MultiplyWithStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 1, 2, 4, 5, 6);
        List<Integer> multipliedNumber = list.stream().map(x -> x * 2).collect(Collectors.toList());
        Set<Integer> uniqueNumber = list.stream().map(y -> y * 2).collect(Collectors.toSet());
        System.out.println(multipliedNumber);
        System.out.println(uniqueNumber);

    }
}
