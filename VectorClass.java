package javaPack;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20);
		v.add(30);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20);
		v.add(30);
		
		System.out.println("Size: " + v.capacity());
		
		v.forEach(System.out::println); //Java 8 feature --> Stream API ... Lambda Expression.
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + "|");
		}
		
		for(int i : v) {
			System.out.println(i);
		}
	}

}
