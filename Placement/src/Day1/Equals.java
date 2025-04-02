package Day1;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();

        
        if (num1.equals(num2)) {
            System.out.println("Num1 is equal to Num2");
        } else if (num1 < num2) {
            System.out.println("Num1 is less than Num2");
        } else {
            System.out.println("Num2 is less than Num1");
        }

        sc.close();
    }
}

