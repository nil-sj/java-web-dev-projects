package org.launchcode;

import java.util.Scanner;
public class StringEdit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, ‘and what is the use of a book," +
                "’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Enter a word to search:");
        String word = input.next();

        int index =  sentence.indexOf(word);
        int length = word.length();

        System.out.println("Your search term first appears at index " + index + ".\nYour term is " + length + " characters long.");

        String newSentence = sentence.replace(word,"");
        System.out.println(newSentence);
    }
}
