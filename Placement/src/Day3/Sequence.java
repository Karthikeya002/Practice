package Day3;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of sequence:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Sequence="+i);
		}
		
		int val = 1;
		while(val<=n){
			System.out.println("Sequence="+val);
			val++;
		}
		

	}

}
