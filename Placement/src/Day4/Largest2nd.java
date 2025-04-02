package Day4;

import java.util.Arrays;

public class Largest2nd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 6, 4, 7, 8, 9};

        Arrays.sort(arr); 

        int secondLargest = arr[arr.length - 2]; 
        System.out.println("Second largest element: " + secondLargest);
    }
}
