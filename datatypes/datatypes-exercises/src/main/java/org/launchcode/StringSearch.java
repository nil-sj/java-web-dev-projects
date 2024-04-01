package org.launchcode;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
       System.out.println("Enter a word to search:");
       String word = input.next();
       boolean result = sentence.toLowerCase().contains(word.toLowerCase());
       System.out.println("Result for the word, '" + word + "' in sentence: " + result);
    }
}
