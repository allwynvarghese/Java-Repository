package javaPack;

public class Swap2Numbers {
	
	public static void swapAddSub(int number1, int number2) {
		
		System.out.println("Before swapping using addition and substraction.");
		System.out.println("Number 1: "+ number1);
		System.out.println("Number 2: "+ number2);
		
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
		
		System.out.println("After swapping using addition and substraction.");
		System.out.println("Number 1: "+ number1);
		System.out.println("Number 2: "+ number2);
	}
	
	public void swapMultDivision(int number1, int number2) {
		
		System.out.println("Before swapping using Multiplication and Division.");
		System.out.println("Number 1: "+ number1);
		System.out.println("Number 2: "+ number2);
		
		number1 = number1*number2;
		number2 = number1/number2;
		number1 = number1/number2;
		
		System.out.println("After swapping using Multiplication and Division.");
		System.out.println("Number 1: "+ number1);
		System.out.println("Number 2: "+ number2);
	}

	public static void main(String[] args) {
		// Swap two numbers without a third variable.
		
		swapAddSub(20, 30);

		Swap2Numbers swap = new Swap2Numbers();
		swap.swapMultDivision(20, 30);
		
	}

}
