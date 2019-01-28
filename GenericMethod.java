package javaPack;

public class GenericMethod {

	public static <E>  void printArray(E[] element){
		
		for(E elements : element) {
			
			System.out.print(elements + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		
		Character[] strArray = {'A','L','L','W','Y','N'};
		
		printArray(intArray);
		printArray(strArray);

	}

}
