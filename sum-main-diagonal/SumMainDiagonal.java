import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined square matrix
        double[][] matrix1 = {
                {1.2, 2.3, 3.4},
                {4.5, 5.6, 6.7},
                {7.8, 8.9, 9.1}
        };

        double sum1 = 0;
        for (int i = 0; i < matrix1.length; i++) {
            sum1 += matrix1[i][i];
        }
        System.out.println("Sum of main diagonal (predefined) = " + sum1);

        // Step 2: User input square matrix
        System.out.print("\nEnter size n: ");
        int n = scanner.nextInt();

        double[][] matrix2 = new double[n][n];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += matrix2[i][i];
        }

        System.out.println("Sum of main diagonal = " + sum2);
        scanner.close();
    }
}

