package Day3;

import java.util.Scanner;

public class WashingMachine1 {
    private int weight;
    private char level;

    // Constructor to initialize weight and water level
    public WashingMachine1(int weight, char level) {
        this.weight = weight;
        this.level = level;
        estimateTime(); // Call function when object is created
    }

    // Method to estimate washing time
    public void estimateTime() {
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            switch (level) {
                case 'L':
                    if (weight <= 2000) {
                        System.out.println("Time Estimated: 25 minutes");
                    } else {
                        System.out.println("INVALID INPUT");
                    }
                    break;

                case 'M':
                    if (weight >= 2001 && weight <= 4000) {
                        System.out.println("Time Estimated: 35 minutes");
                    } else {
                        System.out.println("INVALID INPUT");
                    }
                    break;

                case 'H':
                    if (weight >= 4001 && weight <= 7000) {
                        System.out.println("Time Estimated: 45 minutes");
                    } else {
                        System.out.println("INVALID INPUT");
                    }
                    break;

                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight of the clothes:");
        int weight = sc.nextInt();

        System.out.println("Enter water level (L, M, H):");
        char level = sc.next().charAt(0);

        // Creating object, automatically calls the constructor
        new WashingMachine1(weight, level);

        sc.close(); // Close scanner to prevent resource leak
    }
}
