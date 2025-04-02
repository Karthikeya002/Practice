package Day6;

public class Reverse {

	public static void main(String[] args) {
		String s1  = "Hello";
		
		StringBuilder string = new StringBuilder(s1);
		
		String s2 = string.reverse().toString();
		System.out.println(s2);

	}

}
