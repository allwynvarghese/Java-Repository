package javaPack;

import java.util.Scanner;

public class Binary2Decimal {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner( System.in );
		 System.out.println("Enter a binary number: ");
		 
		  int  binarynum =in.nextInt();
		  int binary=binarynum;
		  in.close();
		int decimal = 0;
		int power = 0;
		 
		while(true){
		 
		 if(binary == 0){
		 
		        break;
		 
		 } else {
		 
		   int tmp = binary%10;
		   decimal += tmp*Math.pow(2, power);
		   binary = binary/10;
		   power++;
		 
		 }
		}
		        System.out.println("Binary="+binary+" Decimal="+decimal); 

	}*/
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		String binaryStr = scan.nextLine();
		
		System.out.println("Decimal: "+ Integer.parseInt(binaryStr, 2));
	}

}
