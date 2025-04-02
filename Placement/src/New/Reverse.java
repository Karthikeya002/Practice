package New;
import java.util.Arrays;

public class Reverse {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            // Swap first and last elements
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = {5,4,3,2,1};
        
        System.out.println("Original Array: " + Arrays.toString(num));
        reverse(num);
        System.out.println("Reversed Array: " + Arrays.toString(num));
    }
}
