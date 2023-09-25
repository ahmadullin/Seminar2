package org.example;

import java.util.Scanner;

public class HW_1 {
    public float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input;
        while (true) {
            System.out.println("Please enter a float value:");
            try {
                input = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
