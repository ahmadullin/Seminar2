package org.example;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
