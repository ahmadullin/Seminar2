package org.example;

public class HW_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            int d = 1;
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
// Добавлено второе исключение ArrayIndexOutOfBoundsException для обработки выхода за границы массива.
// Изменена длина массива
// Изменен делитель