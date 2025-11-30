package src;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create 2 arrays
        System.out.print("Enter size of array 1: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.print("Enter size of array 2: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        // Step 2: Input values
        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of array 2:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Step 3: Create array 3
        int[] array3 = new int[n1 + n2];

        // Step 4: Copy array 1
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        // Step 5: Copy array 2
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        // Print merged array
        System.out.println("Merged array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
