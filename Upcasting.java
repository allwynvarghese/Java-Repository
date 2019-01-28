package javaPack;

public class Upcasting extends UpcastingTo{
	
	int speed = 200;
	
	 void run() {
		
		System.out.println("Dominar runs");
	}

	public static void main(String[] args) {
		
		UpcastingTo up = new Upcasting(); //Upcasting
		up.run(); 	
		System.out.println(up.speed);
	}

}
