package Day2;

import java.util.Random;

public class Great_Small {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(1000);
        int b = r.nextInt(1000);
        int c = r.nextInt(1000);
        int d = r.nextInt(1000);

        // Print the generated numbers
        System.out.println("Generated numbers: A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);

        // Finding the greatest number
        int greatest;
        if (a >= b && a >= c && a >= d) {
            greatest = a;
        } else if (b >= a && b >= c && b >= d) {
            greatest = b;
        } else if (c >= a && c >= b && c >= d) {
            greatest = c;
        } else {
            greatest = d;
        }

        // Finding the smallest number
        int smallest;
        if (a <= b && a <= c && a <= d) {
            smallest = a;
        } else if (b <= a && b <= c && b <= d) {
            smallest = b;
        } else if (c <= a && c <= b && c <= d) {
            smallest = c;
        } else {
            smallest = d;
        }

        // Printing the results
        System.out.println("Greatest number: " + greatest);
        System.out.println("Smallest number: " + smallest);
    }
}

