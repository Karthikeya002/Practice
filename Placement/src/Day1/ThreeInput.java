package Day1;

import java.util.Scanner;

public class ThreeInput {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Compute the sum
        double totalSum = num1 + num2 + num3;

        // Display the result
        System.out.println("The total sum is: " + totalSum);

        // Close the scanner
        scanner.close();
    }
}
