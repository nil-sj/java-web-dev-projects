package org.launchcode;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] myIntArray = { 1, 1, 2, 3, 5, 8 };

        // printing all elements of the array
        System.out.println("Printing all elements of the given array:");
        for (int element : myIntArray) {
            System.out.println(element);
        }

        // printing only the odd numbers:
        System.out.println("Printing only those elements that have odd numbers as values:");
        for (int element : myIntArray) {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }

        String givenPhrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // extracting words and printing them out:
        String[] words = givenPhrase.split(" ");
        System.out.println("Words are: " + Arrays.toString(words));

        // extracting sentences and printing them out:
        String[] sentences = givenPhrase.split("\\.");
        System.out.println("Sentences are: " + Arrays.toString(sentences));
    }
}
