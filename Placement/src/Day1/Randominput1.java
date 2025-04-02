package Day1;

import java.util.Random;

public class Randominput1 {

	public static void main(String[] args) {
		Random r = new Random();
		int num1 = r.nextInt(1000);
		System.err.println(num1);
		int num2 = r.nextInt(1000);
		System.err.println(num2);
		
		System.out.print("the sum is "+(num1+num2));

	}

}
