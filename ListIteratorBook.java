package javaPack;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorBook {
	
	int ISBN, price;
	String author;
	
	public ListIteratorBook(int ISBN, int price, String author) {
		
		this.ISBN = ISBN;
		this.price = price;
		this.author = author;
		
	}

	public static void main(String[] args) {
		
		ListIteratorBook b1 = new ListIteratorBook(123456, 100, "Allwyn");
		ListIteratorBook b2 = new ListIteratorBook(456789, 200, "Varghese");
		ListIteratorBook b3 = new ListIteratorBook(78945, 200, "Sheela");
		
		List <ListIteratorBook> al = new ArrayList <ListIteratorBook> ();
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		for(ListIteratorBook book : al) {
			System.out.println(book.author +" "+ book.price +" "+ book.ISBN);
		}
	}

}
