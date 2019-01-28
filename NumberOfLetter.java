package javaPack;

import java.util.Scanner;

public class NumberOfLetter {

	public static void main(String[] args) {
	
		System.out.println("Enter the String you want.");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		int count = 0;
		
		char [] newLine = line.toCharArray();
		
		for(int i = 0; i < newLine.length; i++) {
			
			if(newLine[i] == 'a') {
				count ++;
				
			}
			
		}
		System.out.println("a = " + count);
	

	}

}
