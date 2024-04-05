package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        String myText;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text phrase [or press enter for default text]");
        myText = input.nextLine();
        if (myText.equals("")) {
            myText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        }

        char[] charactersInString = myText.toCharArray();

        HashMap<Character, Integer> myCharMap = new HashMap<>();

        for (char c : charactersInString) {
            if(Character.isLetter(c)) {
                if (myCharMap.containsKey(Character.toUpperCase(c))) {
                    myCharMap.put(Character.toUpperCase(c), myCharMap.get(Character.toUpperCase(c))+1);
                } else {
                    myCharMap.put(Character.toUpperCase(c), 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> myChar : myCharMap.entrySet()) {
            System.out.println(myChar.getKey() + ": " + myChar.getValue());
        }
    }
}
