package src;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined matrix
        double[][] matrix1 = {
                {1.5, 2.3, 3.1},
                {4.2, 5.0, 6.4},
                {7.8, 8.6, 9.9}
        };

        System.out.print("Enter column index: ");
        int col1 = scanner.nextInt();

        if (col1 < 0 || col1 >= matrix1[0].length) {
            System.out.println("Invalid column!");
        } else {
            double sum1 = 0;
            for (int i = 0; i < matrix1.length; i++) {
                sum1 += matrix1[i][col1];
            }
            System.out.println("Sum of column " + col1 + " = " + sum1);
        }

        // Step 2: User input matrix
        System.out.print("\nEnter rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        double[][] matrix2 = new double[rows][cols];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

            System.out.print("Enter column index: ");
        int col2 = scanner.nextInt();

            if (col2 < 0 || col2 >= cols) {
            System.out.println("Invalid column!");
        } else {
            double sum2 = 0;
            for (int i = 0; i < rows; i++) {
                sum2 += matrix2[i][col2];
            }
            System.out.println("Sum of column " + col2 + " = " + sum2);
        }

    }
}