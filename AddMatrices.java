package javaPack;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) throws IOException {
		// enter two matrices and add them.
		
		/*InputStreamReader r = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(r);*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the rows and coloumns of the matrices.");
		int c, d;
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		System.out.println(rows + " "+ cols);
		
		int first [][] = new int [rows][cols];
		int second [][]= new int [rows][cols];
		int sum [][] = new int [rows][cols];
		
		System.out.println("Enter the elements of the first matrix: ");
		
		for(c = 0; c< rows; c++) {
			for(d = 0; d < cols; d ++) {
				first[c][d] = scan.nextInt();
			}
		}
		//test comment
		
		System.out.println("Enter the elements of the 2nd matrix: ");
		for(c = 0; c< rows; c++) {
			for(d = 0; d < cols; d ++) {
				second[c][d] = scan.nextInt();
			}
		}
		
		System.out.println("Sum of the matrices would be: ");
		for(c = 0; c< rows; c++) {
			for(d = 0; d < cols; d ++) {
				sum[c][d] = first[c][d]+second[c][d];
			}
		}
		
		for(c = 0; c< rows; c++) {
			for(d = 0; d < cols; d ++) {
				System.out.print(sum[c][d] + "\t");
				
			}System.out.println();
		}
		

	}

}
