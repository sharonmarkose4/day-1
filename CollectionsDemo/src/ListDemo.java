import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo {

	public static void main(String[] args) {
		demo1();
		bookList();
	}
	private static void bookList() {
		List<Book> books=new ArrayList<Book>();
		Book book1=new Book("learn Java");
		book1.setPrice(100.0f);
		book1.setPublishYear(2000);
		books.add(book1);
		Book book2=new Book("teach Javascript");
		book2.setPrice(20.0f);
		book2.setPublishYear(1990);
		books.add(book2);
//		books.add(new Book("learn Java"));
//		books.add(new Book("teach Javascript"));
		System.out.println(books);
//		Iterator<Book> it=books.iterator();
//		while(it.hasNext()) {
//			Book book=it.next();
//			if(book.getTitle().contains("learn")) {
//				System.out.println(book);
//			}
//			
//		}
		books.sort(new Comparator<Book>() {
		@Override
			public int compare(Book book1,Book book2) {
				return (int)(book1.getPublishYear()-book2.getPublishYear());
			}
		});
		System.out.println("after sorting"+books);
	
	}

private static void demo1(){
	List<Integer> list=new ArrayList<Integer>();//generics
	list.add(1);
	list.add(3);
	System.out.println("before"+list);
	//list.remove(1);
	System.out.println("after"+list);
	System.out.println(list.contains(3));
	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
	
	}
}
}