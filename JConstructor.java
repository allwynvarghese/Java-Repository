package javaPack;


public class JConstructor {
	
	private String studentName;
	private String schoolName;
	private int rollNo;
	public int barCode;
	
	public JConstructor() {
		this(5);
		studentName = "Mike Joshi";
		schoolName = "Army private school";
		rollNo = 11513;
		
	}
	
	public JConstructor(int i) {
		// TODO Auto-generated constructor stub
		System.out.println(i);
	}

	public void displayData() {
		
		System.out.println("Student name: " + studentName );
		System.out.println("Student name: " + schoolName );
		System.out.println("Student name: " + rollNo );
		System.out.println("Student name: " + barCode );
	}
	 
	

}
