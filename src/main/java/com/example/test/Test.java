package com.example.test;

import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(3,4,5,67,8,1);
        int collect = names.stream().mapToInt(Integer::intValue).sum();
        System.out.println(collect);
    }
}

