package javaPack;

public class JavaMethods {
	
	/*** 1. This method is used to reverse a string. ***/
	public static String reverse(String input) {
		
		String reversed = "";
		
		/***Check if the input value is not null. If null, then do not accept.***/
		if(input.isEmpty() || input.equals(null)) {
			
			System.out.println("The input string is empty/null.");
		}
		
		/*** Check if the input String consist of more than one characters. Else, returns the same chararter as output ***/
		if(input.length() <= 1) {
			input = reversed;
		}
		
		/*** Reversing the String. ***/
		if(input.length() > 1) {
			
			String [] arrInput = input.split("\\s+"); // Splitting the input from spaces using regex.
			for(String ipElement: arrInput) {
				
				reversed = ipElement + " " + reversed;
				
			}
			
		}
		
		return reversed.trim();
	}
	
	/*** Invoking the constructor using the super() keyword. ***/
	
	JavaMethods() {
		
		System.out.println("This is super class");
	}

}
