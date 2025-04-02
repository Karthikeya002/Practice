package Day4;
public class Largest2 {
    
    public static int Large(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1; 
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found!");
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 6, 4, 7, 8, 9}; 

        int secondLargest = Large(arr);

        if (secondLargest != -1) {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
