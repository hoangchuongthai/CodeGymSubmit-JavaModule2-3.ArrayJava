package src;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int size = 5;

        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter value X: ");
        int X = scanner.nextInt();

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Cannot insert!");
        } else {
            for (int i = array.length - 2; i >= index; i--) {
                array[i + 1] = array[i];
            }

            array[index] = X;
            size++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}