package com.myself;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Bookpresent{
    
	@GetMapping(value = "/books")
	public List<Book> booklist(){
		
		List<Book> b = new ArrayList<>();
		b.add(new Book(1, "abc", "def", 100));
		b.add(new Book(2, "abcd", "defg", 200));
		b.add(new Book(3, "hij", "mno", 300));
		b.add(new Book(2, "stu", "vum", 400));
		
		return b;
		
	}
	
	@GetMapping(value = "/book/{Book_id}")
	public Book getBook(@PathVariable ("Book_id") Integer Book_id) {
		
		Book book = new Book();
		
		book.setBook_Id(Book_id);
//		book.setName("abc");
//		book.setAuthor("def");
//		book.setPrice(100);
		
		
		System.out.println("Complete getBook Method");
		return book;
		
	}
	
	@PostMapping(value = "/book")
	public String saveBook(@RequestBody Book book) {
		
		return "Book" + book.toString() + "Saved"; 
	}
	
	
	

}
	


