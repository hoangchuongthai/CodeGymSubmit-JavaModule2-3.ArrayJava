package src;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step1: Create Arr
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;

        System.out.println("Initial Array: ");
        displayArray(arr, n);

        // Step2: Enter element want to delete
        System.out.println("Enter element want to delete: ");
        int X = scanner.nextInt();

        // Step3: Find index_del
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Element " + X + " is not present in the array.");
        } else {
            System.out.println("Element " + X + " is at position : " + index_del);

            // Step4: Delete by over-write
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Giảm số phần tử hợp lệ

            // Step5: Display new Array
            System.out.println("Mang sau khi xoa:");
            displayArray(arr, n);
        }

        scanner.close();
    }

    // Display Array Function
    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
