package javaPack;

public class ThrowExecp {
	
	public static void age(int num) {
		
		if(num < 18) {
			throw new ArithmeticException("Under age");
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		
		age(10);

	}

}
