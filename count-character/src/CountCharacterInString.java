package src;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare a string
        String str = "lap trinh java co ban";

        System.out.println("Given string: " + str);

        // Step 2: Input character
        System.out.print("Enter character to count: ");
        char ch = scanner.next().charAt(0);

        // Step 3: Counter
        int count = 0;

        // Step 4: Traverse string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Step 5: Print result
        System.out.println("Number of occurrences of '" + ch + "' = " + count);

        scanner.close();
    }
}
