package javaPack;

class hi extends Thread{
	
	public void run() {
		
		for(int i =1;i<=5;i++) {
			System.out.println("HI");
			try{Thread.sleep(600);} catch(Exception e) {}
		}
	}
	
}

class hello extends Thread{
	
public void run() {
		
		for(int i =1;i<=5;i++) {
			System.out.println("HELLO");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
	
}

public class MultiThread {

	public static void main(String[] args) {
		
		hi t1 = new hi();
		hello t2 = new hello();
		
		t1.start();
		try{Thread.sleep(500);} catch(Exception e) {}
		t2.start();
	
		
	}

}
