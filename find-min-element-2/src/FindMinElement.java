package src;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare array
        System.out.print("Enter array size: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        // Step 2: Input values
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Assume first element is minimum
        int min = array[0];

        // Step 4: Traverse from second element
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Step 5: Print result
        System.out.println("Minimum value in array: " + min);

    }
}
