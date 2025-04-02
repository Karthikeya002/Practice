package Day3;

import java.util.Scanner;

public class SwitchBreak {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num = sc.nextInt();  // Read integer input

	        switch (num) {  // Use integer cases, not character literals
	            case 1:
	                System.out.println("Rasool is gay");
	                break;
	            case 2:
	                System.out.println("Rasool is Bisexual");
	                break;
	            case 3:
	                System.out.println("Rasool is LGBTQ");
	                break;
	            case 4:
	                System.out.println("Rasool is a girl");
	                break;
	            default:
	                System.out.println("Rasool is not boy");
	                break;
	        }
	        sc.close();  // Close Scanner
	    
	}


}
