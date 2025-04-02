package Day6;

public class Solution {
    public int getFibonacci(int n) {
        if (n < 0) return -1; // Invalid case
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fib = new int[n + 1]; // Array to store Fibonacci numbers
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Fibonacci formula
        }

        return fib[n]; // Return the n-th Fibonacci number
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getFibonacci(5)); // Output: 5
        System.out.println(sol.getFibonacci(7)); // Output: 13
        System.out.println(sol.getFibonacci(10)); // Output: 55
    }
}

