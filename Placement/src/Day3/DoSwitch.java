package Day3;
import java.util.Scanner;

public class DoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Taking user input for two numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            boolean validOperation = true;

            // Performing the operation using switch
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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error! Modulus by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, or %.");
                    validOperation = false;
            }

            // Printing the result if the operation is valid
            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Asking user if they want to continue
            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y'); // Loop continues if user inputs 'Y' or 'y'

        System.out.println("Calculator closed. Thank you!");
        sc.close(); // Closing scanner
    }
}

