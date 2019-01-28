package javaPack;


public class resverseString {

	public static void main(String[] args) {
		
		String input = "this is the String";
		System.out.println("Input String: "+ input);
		String output = JavaMethods.reverse(input);
		System.out.println("The reversed String is: "+ output);

	}
}
