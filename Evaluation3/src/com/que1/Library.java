package com.que1;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> lb = new ArrayList<>();
	
	public  void addBook(Book book) {
		lb.add(book);
		System.out.println("Book added succesfully");
	}
	
	public boolean isEmpty() {
		return false;
		
	}
	
	public  List<Book> viewAllBooks(){
		return lb;
		
	}
	public  List<Book> viewBooksByAuthor(String author )
	{
		List<Book>  books = new ArrayList<>();
		
		for(Book b :lb) {
			if(b.getAuthor().equals(author)) {
				books.add(b);
			}
		}
		return books;
		
	}
	public  int countNoOfBook(String bname) {
		return 0;
		
	}
}
