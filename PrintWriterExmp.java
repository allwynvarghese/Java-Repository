package javaPack;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintWriterExmp {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Allwyn\\Desktop\\Selenium\\PrintWriter.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hello world");
		pw.print(990877);
		pw.close();
		System.out.println("Done");

	}

}
