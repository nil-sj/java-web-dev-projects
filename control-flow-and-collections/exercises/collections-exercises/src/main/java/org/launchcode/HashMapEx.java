package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> studentsByIds = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                studentsByIds.put(newID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();
        System.out.println("\nClass Roster:");
        for (Map.Entry<Integer, String> student : studentsByIds.entrySet()) {
            System.out.println(student.getValue() + "'s ID is " + student.getKey() + ".");
        }
        System.out.println("Number of students in roster: " + studentsByIds.size());
    }
}
