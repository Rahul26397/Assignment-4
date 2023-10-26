package com.ineuron.test;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String inputString = "example string with duplicates";
        String result = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String with Duplicates Removed: " + result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}

