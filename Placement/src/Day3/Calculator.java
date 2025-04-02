package Day3;
import java.util.Scanner;

public class Calculator {
    public static void calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, %):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        calculate(num1, num2, operator); // Calling the method

        sc.close();
    }
}
