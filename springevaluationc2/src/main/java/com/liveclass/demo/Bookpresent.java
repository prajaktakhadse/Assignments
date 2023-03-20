package com.liveclass.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bookpresent{
    
	@GetMapping(value = "/books")
	public List<Book> booklist(){
		
		List<Book> book = new ArrayList<>();
		book.add(new Book(1, "abc", "def", 100));
		book.add(new Book(2, "abcd", "defg", 200));
		book.add(new Book(3, "hij", "mno", 300));
		book.add(new Book(2, "stu", "vum", 400));
		
		return book;
		
	}
}
