/*
 * Running multi threading through the Runnable interface.
 * reducing the class used once into anonymous classes
 * using lambda expression to  further reduce the lines of code.
 * */
package javaPack;

public class MultiThreadInt {

	public static void main(String[] args) throws InterruptedException {

		Thread rt1 = new Thread(() ->
		{
			for(int i =1;i<=5;i++) {
				System.out.println("HI");
				try{Thread.sleep(600);} catch(Exception e) {}
			}
		});
		
		Thread rt2 = new Thread(() ->
		{
			for(int i =1;i<=5;i++) {
				System.out.println("HELLO");
				try{Thread.sleep(500);} catch(Exception e) {}
			}
	});
		
		rt1.start();
		try{Thread.sleep(500);} catch(Exception e) {}
		rt2.start();
		
		System.out.println("Is rt1 alive: "+ rt1.isAlive());
		rt1.join();
		rt2.join();
		System.out.println("Is rt1 alive: "+ rt1.isAlive());
		System.out.println("bye");
	}
}
