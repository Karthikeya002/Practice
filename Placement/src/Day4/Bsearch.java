package Day4;
import java.util.Arrays;

public class Bsearch {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,6,4,7,8,9}; 
        int frontindex = 0;
        int toIndex = 6;
        int key = 4;

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int result = Arrays.binarySearch(arr, frontindex, toIndex, key);

        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }
}

