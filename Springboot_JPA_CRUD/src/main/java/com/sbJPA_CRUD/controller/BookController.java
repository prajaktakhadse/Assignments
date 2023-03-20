package com.sbJPA_CRUD.controller;
//step5---------------

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbJPA_CRUD.model.Book;
import com.sbJPA_CRUD.service.BookInterface;

@RestController
public class BookController {
  
	
	/*it is connect to service layer*/
	@Autowired
	private BookInterface bi;
	
	//<!-- Create a new Book
    //Create New Book -->
	/*it used to posting */
	@PostMapping("Bookish/books")
	public ResponseEntity<Book> storeBook(@RequestBody Book bk1 ){
		
		Book bif = bi.addBook(bk1);//return obj
		
		return new ResponseEntity<Book>(bif , HttpStatus.ACCEPTED);//jo book save hua uska obj denga
		 
		
	}
	
	
	
	
	
	 //	Get the information of any particular book by id
	//	■ To get a particular book
	//	■ If a book is not existing, it should throw BookNotFoundException.

	/* it used to get the book*/
	@GetMapping("Bookish/books/{book_id}")
	public ResponseEntity<Book> getBookById(@PathVariable("book_id")Integer BookId){
		
		Book bo = bi.findBookById(BookId);//return obj
	    
		if(bo != null) {
			return new ResponseEntity<Book>(bo , HttpStatus.OK);
		}
		else {
			
			return null;
		}
	}
	
		
	//	○ Get All books information
	//	■ To get a list of books
	//	■ If no data exist, it should throw NoDataFoundException
	@GetMapping("Bookish/books")
	public ResponseEntity<List<Book>> listOfBook(){
		List<Book> b = bi.getBookList();
		if(b.size()> 0) {
			return new ResponseEntity<List<Book>>(b,HttpStatus.FOUND);
		}else {
			return null;
		}
	}
	
	
	

	
	//	○ Delete Book
	//	■ To delete a particular Book from the database based on bookId
	//	. ■ If a book is not existing, it should throw BookNotFoundException
	
      @DeleteMapping("Bookish/books/{id}")
      public ResponseEntity<Book> deltById(@PathVariable("id") Integer B_id ) throws Exception{
    	Book delb =   bi.deleteById(B_id);
    	
    	if(delb != null) {
    		return new ResponseEntity<Book>(delb  , HttpStatus.GONE);
    	}
    	else {
    	   return null;
    	}  
      }
      
		// Update Book
		// ■ To update Book in database
		//  ■ If a book is not existing already, it should throw BookNotFoundException.
	@PutMapping("Bookish/books")
	public ResponseEntity<Book> updateById(@RequestBody Integer bkkd) throws Exception{
		Book updbk1 = bi.updateBookById(bkkd);
		
		if(updbk1 != null) {
			return new ResponseEntity<Book>(updbk1 , HttpStatus.ACCEPTED);
		}
		else {
            return null;
		}
	}
	
	
	
	
}
