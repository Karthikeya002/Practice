package Day3;

import java.util.Scanner;

public class WhileCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'Y'; // Initial choice to enter the loop

        while (choice == 'Y' || choice == 'y') {
            // Taking user input
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;
            boolean validOperation = true;

            // Switch statement for arithmetic operations
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        validOperation = false;
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error! Modulus by zero is not allowed.");
                        validOperation = false;
                        result = 0;
                    } else {
                        result = num1 % num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, or %.");
                    validOperation = false;
                    result = 0;
            }

            // Display the result if the operation is valid
            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Asking user if they want to continue
            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Calculator closed. Thank you!");
        sc.close(); // Closing scanner
    }
}
