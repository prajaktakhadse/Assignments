package com.sbJPA_CRUD.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//step4--------------
import com.sbJPA_CRUD.model.Book;
import com.sbJPA_CRUD.repository.Bookrepo;
//Step 4----------

@Service
public class BookServiceImpl implements BookInterface{
	
	
	/*here we get the object of repo for storing the implementation method*/
	@Autowired
    private Bookrepo br;
	
   
	/*it will save the book  which register*/
	@Override
	public Book addBook(Book bk) {
		Book saver = br.save(bk);//.save come from repo and direct store in the table
		return saver;
	}

	/*it will get the book by bookid*/
	@Override
	public Book findBookById(Integer book_Id) {
		Optional<Book> opbk = br.findById(book_Id);
		if(opbk.isPresent()) {
			Book b = opbk.get();
			return b;
		}
		else {
		    return null;
		}
	}

	

	//	Get All books information
	//	■ To get a list of books
	//	■ If no data exist, it should throw NoDataFoundException

	@Override
	public List<Book> getBookList() {
		List<Book> listb = br.findAll();
		if(listb != null) {
			return listb;
		}
		else {
			return null;
		}
		
	}

	
			
		//	○ Delete Book
		//	■ To delete a particular Book from the database based on bookId
		//	■ If a book is not existing, it should throw BookNotFoundException.
	@Override
	public Book deleteById(Integer b_id) throws Exception {
	  Optional<Book> deltb =	br.findById(b_id);
	 if(deltb.isPresent()) {
		Book b = deltb.get();
		br.delete(b);
		return b;
	 }else {
		throw new Exception("Student is not Present");
	 }
	}

	
	
	
	//	Update Book
	//	■ To update Book in database
	//	■ If a book is not existing already, it should throw BookNotFoundException.
	@Override
	public Book updateBookById(Integer id)throws Exception{
		Optional<Book> ob = br.findById(id);
          if(ob.isPresent()) {
			
			Book b = ob.get();
			b.setPrice(b.getPrice() + 100);
			return b;
		}
		else {
			throw new Exception("Student is Not Present");
		}
	}
	
	
	
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
