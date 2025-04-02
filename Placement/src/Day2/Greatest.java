package Day2;

import java.util.Random;

public class Greatest {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(1000);
        int b = r.nextInt(1000);
        int c = r.nextInt(1000);
        
       
        System.out.println("Generated numbers: A = " + a + ", B = " + b + ", C = " + c);
        
        
        if (a >= b && a >= c) {
            System.out.println("A is the greatest.");
        } else if (b >= a && b >= c) {
            System.out.println("B is the greatest.");
        } else {
            System.out.println("C is the greatest.");
        }
    }
}
