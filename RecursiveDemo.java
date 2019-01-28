package javaPack;

public class RecursiveDemo {
	
	public static void recursiveDemo(int i) {
		if(i<=10) {
			System.out.println(i);
			recursiveDemo(i+1); // using the method again in this method.
		}
	}

	public static void main(String[] args) {
		// Printing numbers 1 - 10 without loops
		
		recursiveDemo(1);

	}

}
