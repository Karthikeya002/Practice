package New;

public class Max {
  public static int max(int num[]) {
	  int max = num[0];
	  for(int i = 1;i<num.length;i++) {
		  if(num[i]>max) {
			  max = num[i];
		  }
	  }
	  return max;
	  
  }
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9};
		
		int max1 = max(num);
		System.out.println(max1);
	}
}

