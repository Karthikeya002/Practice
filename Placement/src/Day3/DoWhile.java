package Day3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Numbers:");
		int n = sc.nextInt();
		int val = 1;
		do {
			System.out.println("welcome to the do while loop");
			val++;
		}while(val<=n);

	}

}
