package Day1;

public class Addition {

	public static void main(String[] args) {
		
		double num1 = Math.random();
		double num2 = Math.random();
		// Math.random generates big number which cannot be stored in integer
		System.out.println("Enter 1st Number:-" + num1);
		System.out.println("Enter 2st Number:-" + num2);
		
		System.out.println("Sum of two nums: " + (num1 + num2));

	}

}
