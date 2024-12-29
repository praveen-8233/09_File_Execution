package com.example.occuranceOfCharacter;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {

    public static void main(String[] args) {
        String str1 = "PRAVEEN";

        // Create a HashMap to store characters and their occurrences
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to uppercase to handle case insensitivity (optional)
        str1 = str1.toUpperCase();

        // Iterate through each character in the string
        for (char c : str1.toCharArray()) {
            // Update the count of the character in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the characters and their occurrences
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

