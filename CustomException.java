package javaPack;

public class CustomException {
	
	public void age(int num) throws InvalidAgeException {
		
		if(num < 18) {
			throw new InvalidAgeException("Not Valid age");
		}else {
			System.out.println("Welcome!");
		}
	}

	public static void main(String[] args) {
		
		CustomException e = new CustomException();
		try {
			e.age(18);
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Program flow continues");

	}

}
