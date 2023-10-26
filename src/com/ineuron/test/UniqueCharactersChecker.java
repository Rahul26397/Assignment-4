package com.ineuron.test;

import java.util.Scanner;

public class UniqueCharactersChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        if (hasAllUniqueCharacters(input)) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }

    // Function to check if a string contains all unique characters
    public static boolean hasAllUniqueCharacters(String str) {
        // Assuming ASCII characters (256 possible characters)
        if (str.length() > 256) {
            return false;
        }

        boolean[] charSet = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                return false; // Character has been seen before
            }

            charSet[val] = true;
        }

        return true; // All characters are unique
    }
}

