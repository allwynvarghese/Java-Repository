package javaPack;

public class Print_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hello = "Hello";
		
		for(int i=1;i<=50;i++) {
			
			System.out.print(i);
			
			if(i%5 == 0 && i < 50) {
				System.out.print(hello);
			}

		}

	}

}
