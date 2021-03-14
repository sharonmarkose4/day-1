package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {

	public static void main(String[] args) {
		createMapofBooks();
	}
	private static void createMapofBooks() {
		Map<String,Book>books=new HashMap<String,Book>();
//		Book book=new Book("java");
//		books.put("book1", book);
//		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {
			Book book=new Book("Title"+i);
			book.setPrice(100*i);
			books.put("book"+i,book);
		}
//		books.clear();
		books.remove("book4");
		System.out.println(books.containsKey("book3"));
//		System.out.println(books);
		System.out.println(books.size());
	}
}
