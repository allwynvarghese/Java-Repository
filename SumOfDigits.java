package javaPack;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void sumNoRecursion(int number) {
		
		int sum = 0;
		
		System.out.println("Enter a number is: "+ number);
		
		while(number != 0) {
			sum = sum + (number%10);
			number = number/10;
		}
		
		System.out.println("The sum of the digit w/o recursion is: "+ sum);
	}
	
	public static int sumRecursion (int n) {
		
		int sum = 0;
		
		System.out.println("Enter a number is: "+ n);
		if(n==0){
			return sum;
			}
			else{
			 
			 sum+=n%10;
			 sumRecursion(n/10);
			 
			} 
			 
			return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		//sumNoRecursion(num);
		sumRecursion(num);

	}

}
