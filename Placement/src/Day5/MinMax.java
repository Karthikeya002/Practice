package Day5;

	import java.util.ArrayList;

public class MinMax {
    
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(12);
	        numbers.add(45);
	        numbers.add(7);
	        numbers.add(89);
	        numbers.add(23);

	        int min = numbers.get(0);
	        int max = numbers.get(0);

	        // Loop through the list
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	    }
	}

