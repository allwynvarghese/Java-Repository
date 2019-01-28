package javaPack;

import java.util.Scanner;

public class NumberCloserto100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		//System.out.println("First number is "+ first);
		
		System.out.println("Enter the second number: ");
		int second = scan.nextInt();
		//System.out.println("Second number is "+ second);
		
		scan.close();
		
		int res_a =0;
		int res_b = 0; 
		
		if(first > 100) {
			res_a = first - 100;
		}else {
			res_a = 100 - first;
		}
		
		if(second > 100) {
			res_b = second - 100;
		}else {
			res_b = 100 - second;
		}
		
		if(res_a < res_b) {
			System.out.println(first + " is closer to 100.");
		}else if(res_b < res_a) {
			System.out.println(second + " is closer to 100.");
		}else if(res_a == res_b) {
			System.out.println("Both the numbers are equally close.");
		}
	}

}
