package org.launchcode;

import java.util.Scanner;

public class AreaRect {
    public static int calculateArea(int[] args) {
        return args[0] * args[1];
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle:");
        int height = inputs.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = inputs.nextInt();
        int[] dimensions = {height, width};
        int area = calculateArea(dimensions);
        System.out.println("The area is " +  area);
    }
}
