package com.example.evenWithStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,4,6,7,8,9);
        List<Integer> evenNum = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenNum);
    }
}
