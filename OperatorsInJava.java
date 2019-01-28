package javaPack;

import java.util.ArrayList;
import java.util.Collection;

public class OperatorsInJava {

	public static void main(String[] args) {
		
		Collection <String> values = new ArrayList<>(); //ArrayList using Java Generic.
		values.add("Allwyn");
		values.add("Varghese");
		values.add("Sheela");
		
		for(String o: values) {
			System.out.println(o);
		}

	}

}
