package javaPack;

public class ConstructorMain extends JavaMethods{
	
	ConstructorMain(){
		
		super();
		System.out.println("This is the subclass");
		
	}

	public static void main(String[] args) {
		
		JConstructor data = new JConstructor();
		
		data.barCode = 1234567890;
		
		data.displayData();

	}

}
