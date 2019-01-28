package javaPack;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static double perimeterOfCircle(int r) {
		
		double perimeter = 2*Math.PI*r;
		return perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the radius of the circle.");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		
		//Area of circle.
		double area= Math.PI *r*r;
		System.out.println("Area of circle is: "+ area);
		
		//Perimeter of circle.
		double perimeter = perimeterOfCircle(r);
		System.out.println("");
		System.out.println("Perimeter of circle: "+ perimeter);
		

	}

}
