package com.example.removeDuplicateElementWithStream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,2,1,3,4,5,6);
        Set<Integer> removeDuplicate = list.stream().sorted().collect(Collectors.toSet());
        System.out.println(removeDuplicate);
    }
}
