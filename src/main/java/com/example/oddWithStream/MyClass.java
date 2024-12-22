package com.example.oddWithStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,6,8,9,4,53,2);
        List<Integer> num = list.stream().filter(x->x%2 != 0).collect(Collectors.toList());
        System.out.println(num);
    }
}
