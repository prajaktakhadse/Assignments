package com.sbJPA_CRUD.service;
import java.util.List;

//step3 -----------------------
import com.sbJPA_CRUD.model.Book;

public interface BookInterface {
	
      public Book addBook(Book book);
      
      public Book findBookById(Integer book_Id);
      
      public List<Book>  getBookList();
      
      public Book deleteById(Integer b_id)throws Exception;
      
      public Book updateBookById(Integer id)throws Exception;
      
}
