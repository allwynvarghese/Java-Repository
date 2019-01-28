package javaPack;

public class fibonacci {

	public static void fiboRecursive(int n1, int n2) {

		int sum = 0;

		if (n1 == 0) {
			System.out.println(n1 + "\n" + n2);
		}

		sum = n1 + n2;

		if (sum < 10000) {
			System.out.println(sum);
			n1 = n2;
			n2 = sum;

			fiboRecursive(n1, n2);
		}

	}

	public static void fibo(int num) {
		
		int n1 = 0;
		int n2 =1;
		int sum = 0;
		
		System.out.println(n1 + "\n" + n2);
		for(int i =0; i < num ;i++) {
			
			sum = n1+n2;
			if(sum < num) {
				
			System.out.print(sum);
			n1=n2;
			n2=sum;
			double ratio = n2/n1;
			System.out.println(" Ratio = "+ ratio);
			}
			
		}

	}

	public static void main(String[] args) {

		//fiboRecursive(0, 1);
		fibo(100);
	}

}
