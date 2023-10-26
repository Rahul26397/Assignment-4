package com.ineuron.test;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "example string with duplicates";
        printDuplicateCharacters(inputString);
    }

    public static void printDuplicateCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Print the duplicate characters
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
            }
        }
    }
}

