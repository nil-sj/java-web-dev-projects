package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> myIntArrayList = new ArrayList<>();

        // Adding numbers to the ArrayList:
        for (int i = 0; i < 10; i++) {
            myIntArrayList.add(i+1);
        }

        // Calling the sumEven function for the ArrayList:
        System.out.println(sumEvenIntArrayList(myIntArrayList));

        // Creating an array list of words:
        ArrayList<String> myWordList = new ArrayList<>();
        myWordList.add("Apple");
        myWordList.add("Banana");
        myWordList.add("Mango");
        myWordList.add("Melon");
        myWordList.add("Orange");
        myWordList.add("Berry");

        // Calling the function to print only the words with five characters
        System.out.println("Printing out the words containing exactly five letters");
        printFiveCharWords(myWordList);

        // Example case where we need the user to input the number of letters
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of letters: ");
        int numChars = input.nextInt();
        System.out.println("Printing out the words containing exactly " + numChars + " letters");
        printNCharWords(myWordList, numChars);

        // Trying the example of getting words from a String and then generating an ArrayList
        String myPhrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> myNewList = new ArrayList<>(Arrays.asList(myPhrase.split(" ")));
        System.out.println("Trying out the custom words now...");
        printFiveCharWords(myNewList);
    }

    // Defining the sumEven function for the ArrayList
    public static int sumEvenIntArrayList(ArrayList<Integer> arrlst) {
        int sum = 0;
        for (int item : arrlst) {
            if (item % 2 == 0) {
                sum += item;
            }
        }
        return sum;
    }

    // Defining the function to print only the words with five characters:
    public static void printFiveCharWords(ArrayList<String> wordList) {
        for (String word : wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    // Defining the function to print words with selected number of characters:
    public static void printNCharWords(ArrayList<String> wordList, int numLetters) {
        for (String word : wordList) {
            if (word.length() == numLetters) {
                System.out.println(word);
            }
        }
    }
}
