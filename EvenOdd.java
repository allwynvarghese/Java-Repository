package javaPack;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i =0; i<numbers.length; i++) {
			
			if(numbers[i]%2 == 0) {
				System.out.println(numbers[i] + " is an even number.");
			}else {
				System.out.println(numbers[i] + " is a odd number.");
			}
			
		}

	}

}
