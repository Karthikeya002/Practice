package Day5;

public class Count1 {
   public static int count(int arr[]) {
	   int maxcount= 0, currentcount=0;
	   for(int num : arr) {
		   if(num ==1) {
			   currentcount++;
			   maxcount = Math.max(maxcount, currentcount);
		   }
		   else {
			   currentcount=0;
		   }
	   }
	   return maxcount;
   }
	public static void main(String[] args) {
		int arr1[] = {0,1,1,0,1,1,1,1,0,0,0,1};
		int arr2[] = {0,1,1,0,1,1,1,1,0,1,1,1};
		int arr3[] = {0,1,1,0,1,1,1,1,0,0,0,1};
		int arr4[] = {0,1,1,1,1,1,1,1,0,0,1,1};
		int arr5[] = {0,1,1,0,1,1,1,1,0,0,1,1};
		int arr6[] = {0,1,1,0,1,1,1,1,0,1,0,1};
		
		System.out.println(count(arr1));
		System.out.println(count(arr2));
		System.out.println(count(arr3));
		System.out.println(count(arr4));
		System.out.println(count(arr5));
		System.out.println(count(arr6));
		

	}

}
