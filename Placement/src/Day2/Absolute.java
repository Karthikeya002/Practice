package Day2;
import java.util.Scanner;
public class Absolute{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        // Perform addition and take absolute value
	        int addition = num1 + num2;
	        System.out.println("Addition of two values: " + num1 + " + " + num2 + " = " + Math.abs(addition));

	        // Perform subtraction and take absolute value
	        int subtraction = num1 - num2;
	        System.out.println("Subtraction of two values: " + num1 + " - " + num2 + " = " + Math.abs(subtraction));

	        scanner.close();
	    
	}

}
