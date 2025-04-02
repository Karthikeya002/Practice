package Day1;

public class Add {
    public static void main(String args[]) {
        // Check if at least two arguments are passed
        if (args.length < 2) {
            System.out.println("Error: Please provide two numbers as command-line arguments.");
            return;
        }

        String num1 = args[0];
        String num2 = args[1];

        System.out.println("Number_1: " + num1);
        System.out.println("Number_2: " + num2);

        // String concatenation (for reference)
        System.out.println("Concatenated String Sum: " + (num1 + num2));

        // Convert strings to integers and handle errors
        try {
            int val1 = Integer.parseInt(num1);
            int val2 = Integer.parseInt(num2);
            System.out.println("The Sum: " + (val1 + val2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        }
    }
}
