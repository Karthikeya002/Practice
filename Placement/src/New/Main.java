package New;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(scanner.nextLine());
        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freq.entrySet());
        sortedList.sort((a, b) -> {
            int freqCompare = b.getValue().compareTo(a.getValue());
            return freqCompare != 0 ? freqCompare : b.getKey().compareTo(a.getKey());
        });
        
        for (int i = 0; i < k; i++) {
            System.out.print(sortedList.get(i).getKey() + " ");
        }
        scanner.close();
    }
   
}

