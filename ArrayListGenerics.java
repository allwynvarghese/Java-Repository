package javaPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Allwyn");
		al.add("Varghese");
		al.add("Oommen");	
		
		System.out.println(al.get(0));
		
		Iterator <String> it = al.iterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
			
		}
	}

}
