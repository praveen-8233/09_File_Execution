package com.example.getNameWithStartCharacter;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyService {

    public String countOfFile() {
        List<String> list = Arrays.asList("Praveen", "Pawan", "Radha", "Kajal", "Nawab");

        // Filter names starting with 'P'
        List<String> namesStartingWithP = list.stream()
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.toList());

        // Count names starting with 'P'
        int count = namesStartingWithP.size();

        // Return names and count as a string
        return "Names starting with 'P': " + namesStartingWithP + ", Total count: " + count;
    }
}
