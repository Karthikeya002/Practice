package Day1;

import java.util.Random;

public class RandomGreat {

	public static void main(String[] args) {
		Random r = new Random();
		
		Integer num1 = r.nextInt(1000);
		System.err.println(num1);
		Integer num2 = r.nextInt(1000);
		System.err.println(num2);
		
		 if (num1.equals(num2)) {
	            System.out.println("Num1 is equal to Num2");
	        } else if (num1 < num2) {
	            System.out.println("Num1 is less than Num2");
	        } else {
	            System.out.println("Num2 is less than Num1");
	        }

	}

}
