/*
 * Type specified in Container class 
 * */
package javaPack;

public class GenericsInJava {

	public static void main(String[] args) {
		
		Container<Integer> val = new Container<>();
		val.values = 9; //initializing the value. W/o this we get a null pointer exception.
		val.show();

	}

}
