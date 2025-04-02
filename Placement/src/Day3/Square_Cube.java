package Day3;

import java.util.Scanner;

public class Square_Cube {

    // Function to calculate square
    public static int square(int n) {
        return n * n;
    }

    // Function to calculate cube
    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n natural numbers: ");
        int n = sc.nextInt();
        
        System.out.println("Squares");
        for (int i = 1; i <= n; i++) {
            System.out.print(square(i)+" ");

        }

        System.out.println("\nCubes");
        for (int i = 1; i <= n; i++) {
            System.out.print(cube(i)+" ");
        }

        System.out.println(); // Print new line for clean output
        sc.close(); // Close scanner
    }
}
