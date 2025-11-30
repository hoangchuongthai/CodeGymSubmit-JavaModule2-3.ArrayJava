package src;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined matrix
        double[][] matrix1 = {
                {1.2, 3.5, 4.8},
                {9.1, 2.3, 5.6},
                {0.7, 6.4, 8.9}
        };

        double max1 = matrix1[0][0];
        int row1 = 0;
        int col1 = 0;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] > max1) {
                    max1 = matrix1[i][j];
                    row1 = i;
                    col1 = j;
                }
            }
        }

        System.out.println("Max value (predefined): " + max1);
        System.out.println("Position: row " + row1 + ", column " + col1);

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

        double max2 = matrix2[0][0];
        int row2 = 0;
        int col2 = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix2[i][j] > max2) {
                    max2 = matrix2[i][j];
                    row2 = i;
                    col2 = j;
                }
            }
        }

        System.out.println("Max value (user input): " + max2);
        System.out.println("Position: row " + row2 + ", column " + col2);

    }
}