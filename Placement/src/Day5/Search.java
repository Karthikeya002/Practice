package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Search {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(12);
	        numbers.add(45);
	        numbers.add(7);
	        numbers.add(89);
	        numbers.add(23);
	         
	        int target = sc.nextInt();
	        if (numbers.contains(target)) {
	            System.out.println(target + " is present in the list.");
	        } else {
	            System.out.println(target + " is NOT present in the list.");
	        }
}
}