package javaPack;

public class reverseString {

	//1. Converting the String to StringBuffer and reversing.
	public StringBuffer string2Stringbuffer(String str) {
		
		StringBuffer sbr = new StringBuffer(str);
		StringBuffer result = sbr.reverse();
		return result;
		
	}
	
	//2. Converting the String to StringBuilder and reversing.
	public static StringBuilder string2Stringbuilder(String str) {
		
		StringBuilder sbl = new StringBuilder(str);
		StringBuilder result = sbl.reverse();
		return result;
	}
	
	//3. Using recursive method to reverse the string.
	public static String reverseResult(String str) {
		
		if(str.isEmpty()) {
			return str;
		}else {
			
			return reverseResult(str.substring(1)) + str.charAt(0);
			
		}
	}
	
	//4. Reversing the string without using the string API(Function).
	public static void noStringAPI(String str) {
		
		String revString = "";
		
		for(int i = str.length()-1 ; i>=0; i--) {
			
			revString += str.charAt(i);
			
		}
		System.out.print(revString);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString a = new reverseString();
		StringBuffer rev = a.string2Stringbuffer("Hello Java");
		
		StringBuilder reverse = string2Stringbuilder("this is mava");
		
		String recurRes = reverseResult("Hello Mava");
		
		System.out.println(rev);
		System.out.println(reverse);
		System.out.println(recurRes);
		
		noStringAPI("Hello_Mava");

	}
}
