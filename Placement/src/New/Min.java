package New;

public class Min {
  public static int min(int num[]) {
      int min = num[0]; // Initialize with the first element
      for(int i = 1; i < num.length; i++) { // Start from the second element
          if(num[i] < min) {
              min = num[i]; // Update min if a smaller number is found
          }
      }
      return min; // Return the minimum number
  }

  public static void main(String[] args) {
      int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int min1 = min(num);
      System.out.println("Minimum value: " + min1);
  }
}
