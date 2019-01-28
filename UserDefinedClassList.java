package javaPack;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassList {

	public static void main(String[] args) {
		
		student s1= new student(1,"Allwyn","Mumbai");
		student s2 = new student(2,"Varghese","Kerala");
		
		ArrayList <student> list = new ArrayList<student> ();
		list.add(s1);
		list.add(s2);
		
		/*Iterator <student> ir = list.iterator();
		while(ir.hasNext()) {
			student st = (student)ir.next();
			System.out.println(st.roll +" "+ st.name +" "+st.address);
		}*/
		for(student element: list) {
			
			System.out.println(element.roll+" "+element.name+" "+element.address);
			
		}
		
		
	}

}
