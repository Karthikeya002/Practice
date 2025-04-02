package Day1;

import java.util.Scanner;

public class GreatNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println("Num1 is less than Num2");
		}
		else {
			System.out.println("Num2 is less than num1");
		}
		sc.close();
	}

}
