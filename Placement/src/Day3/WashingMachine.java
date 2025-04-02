package Day3;

import java.util.Scanner;

public class WashingMachine {
    
    // User-defined function to determine time
    public static void mass(int weight, char level) {
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
                    break; // Added break

                case 'M':
                    if (weight >= 2001 && weight <= 4000) {
                        System.out.println("Time Estimated: 35 minutes");
                    } else {
                        System.out.println("INVALID INPUT");
                    }
                    break; // Added break

                case 'H':
                    if (weight >= 4001 && weight <= 7000) {
                        System.out.println("Time Estimated: 45 minutes");
                    } else {
                        System.out.println("INVALID INPUT");
                    }
                    break; // Added break

                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight of the clothes:");
        int weight = sc.nextInt(); // Read weight as an integer

        System.out.println("Water level (L, M, H):");
        char level = sc.next().charAt(0); // Read water level as a single character

        // Calling the user-defined function
        mass(weight, level);

        sc.close(); // Close scanner to prevent resource leak
    }
}
