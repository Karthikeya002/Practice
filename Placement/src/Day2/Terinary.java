package Day2;

import java.util.Random;

public class Terinary {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(1000);
        int b = r.nextInt(1000);
        int c = r.nextInt(1000);
        
        
        System.out.println("Generated numbers: A = " + a + ", B = " + b + ", C = " + c);
        
        // Ternary Operator Syntax:
        // variable = (condition) ? value_if_true : value_if_false;
        
        
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
        System.out.println("The greatest number is: " +greatest);
        
    }
}
