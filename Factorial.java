package javaPack;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	      
	      System.out.println("Enter a number to find the Factorial: ");
	      Scanner ip = new Scanner(System.in);
	      int num = ip.nextInt();
	      int fact =0;
	      for(int i = num-1;i>0;i--){
	          num = num*i;
	      }
	      
	      System.out.println("Factorial: "+ num);
	   }

}
