package Day3;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int weight = scanner.nextInt();
        char waterLevel = scanner.next().charAt(0);
        
        scanner.close();
        
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            switch (waterLevel) {
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
                    if (weight > 4000) {
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
}

