package javaPack;

import java.util.Iterator;
import java.util.LinkedList;

import bsh.This;

public class LinkedListCollection {
	
	int id;
	String name, author, isbn;
	
	public LinkedListCollection(int id, String name, String author, String isbn) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		
	}

	public static void main(String[] args) {
		
		LinkedList <String> lk= new LinkedList <String> ();
		lk.add("Allwyn");
		lk.add("Varghese");
		lk.add("Sheela");
		
		Iterator <String> itr = lk.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		LinkedListCollection b1 = new LinkedListCollection(1, "First Book", "Allwyn", "isbn1234");
		LinkedListCollection b2 = new LinkedListCollection(2, "second Book", "Varghese", "isbn5678");
		LinkedListCollection b3 = new LinkedListCollection(3, "third Book", "Sheela", "isbn90112");
		
		LinkedList <LinkedListCollection> bk = new LinkedList<LinkedListCollection>();
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		
		for(LinkedListCollection book : bk) {
			System.out.println(book.id + " " + book.name + " " + book.author + " " + book.isbn );
		}
	}

}
