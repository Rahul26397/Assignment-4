package com.ineuron.test;

import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        char maxChar = findMaxOccurringCharacter(input);

        System.out.println("The maximum occurring character is: " + maxChar);
    }

    // Function to find the maximum occurring character in a string
    public static char findMaxOccurringCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty.");
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}

