package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
            Divide(10, 2);
            Divide(5, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            int points = CheckFileExtension(fileName);
            System.out.println(student + ": " + points + " points");
        }
    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Division by Zero is not allowed");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x + "/" + y + " = " + x/y);
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        if (fileName == null || fileName == "") {
            try {
                throw new InvalidFileException("File name is null or empty");
            } catch (InvalidFileException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                return 0;
            }
        } else {
            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}