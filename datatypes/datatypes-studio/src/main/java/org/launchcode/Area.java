package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean invalidInput = true;
        double r = 0.0;

        while (invalidInput) {
            System.out.print("Enter a radius: ");

            if (input.hasNextInt() || input.hasNextDouble()) {
                r = Math.abs(input.nextDouble());
                invalidInput = false;
            } else {
                String stringValue = input.next();
                System.out.println("Sorry, your input " + stringValue + " is invalid. Please try again.");
            }
        }

//        double r = input.nextDouble();
//        double area = Math.PI * r * r;
        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
