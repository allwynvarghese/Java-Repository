package javaPack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
		
		System.out.println("Date: "+ date.toString()); // displaying today date.
		System.out.println(ft.format(date)); // Displaying formatted date.
		

	}

}
