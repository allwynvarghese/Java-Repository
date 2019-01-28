package javaPack;

public class Container<T> {
	
	T values;
	
	public void show() {
		System.out.println(values.getClass().getTypeName());
	}

}
