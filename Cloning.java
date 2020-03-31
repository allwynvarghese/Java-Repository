package javaPack;

import java.lang.Cloneable;

public class Cloning implements Cloneable{

	int stdNo;
	String stdName;
	
	Cloning(int stdNo, String stdName){
		
		this.stdNo = stdNo;
		this.stdName = stdName;
		
		System.out.println("stdNo: "+ stdNo + " , " + "stdName: "+ stdName);
	}
	
// just a comment
	protected Object cloner() throws CloneNotSupportedException {
		
		return super.clone();
		
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Cloning c1 = new Cloning(161,"Amit");
		Cloning c2 = (Cloning)c1.cloner();
		
		System.out.println("c2.stdNo: " + c2.stdNo + " , " + "c2.stdName: "+c2.stdName );
		

	}

}
