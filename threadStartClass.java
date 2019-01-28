package javaPack;

public class threadStartClass extends Thread{
	
	public void run() {
		
		for(int i =1; i<5; i++) {
			
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadStartClass t1 = new threadStartClass();
		threadStartClass t2 = new threadStartClass();
		
		t1.start();
		t2.start();

	}

}
