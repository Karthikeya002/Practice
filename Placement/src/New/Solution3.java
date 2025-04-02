package New;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Read the size of the array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Read array elements
        }
        scanner.close();

        int count = 0;  // To store the count of negative subarrays

        // Iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;  // Sum of the current subarray
            for (int end = start; end < n; end++) {
                sum += arr[end];  // Add the current element to sum
                if (sum < 0) {  
                    count++;  // If the sum is negative, increase count
                }
            }
        }

        System.out.println(count);  // Print the total count of negative subarrays
    }
}
