package com.example.multiplyWithoutStream;

import java.util.Arrays;
import java.util.List;

public class MultiplyWithoutStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,7);
        for(int i : list){
            int u = i * 2;
            System.out.println(u);
        }
    }
}
