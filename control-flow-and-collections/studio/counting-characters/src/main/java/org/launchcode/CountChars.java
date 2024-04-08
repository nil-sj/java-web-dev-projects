package org.launchcode;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        String myText;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text phrase [or press enter for default text]");
        myText = input.nextLine();
        input.close();

        if (myText.equals("")) {
            try {
                File file = new File("/Users/niladri/Desktop/LaunchCode/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/java/org/launchcode/readit.txt");
                Scanner fileScan = new Scanner(file);
                myText = fileScan.nextLine();
                fileScan.close();
            }
            catch(Exception error) {
                System.out.println("Error" + error);
            }
        }

        char[] charactersInString = myText.toCharArray();

        HashMap<Character, Integer> myCharMap = new HashMap<>();

        for (char c : charactersInString) {
            if(Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                if (myCharMap.containsKey(c)) {
                    myCharMap.put(c, myCharMap.get(c)+1);
                } else {
                    myCharMap.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> myChar : myCharMap.entrySet()) {
            System.out.println(myChar.getKey() + ": " + myChar.getValue());
        }

        // Alternative approach:
        //        for (char letter : myCharMap.keySet()) {
        //            System.out.println(letter + ": " + myCharMap.get(letter));
        //        }
    }
}
