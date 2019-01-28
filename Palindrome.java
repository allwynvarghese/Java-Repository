package javaPack;

public class Palindrome {
	
	public static void chkPalindrome(String str) {
		
		String revString = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			revString += str.charAt(i);
		}
		
		if(revString.equals(str)) {
			System.out.println("Its a palindrome.");
		}else {
			System.out.println("Its not a palindrome.");
		}
	}

	public static void main(String[] args) {
		
		String word = "Hello";
		String word2 = "madam";
		
		chkPalindrome(word);
		chkPalindrome(word2);
	}

}
