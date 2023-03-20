//Q1. Create a basic application named Library Management System having Library class containing
//list of books present in the library .(Choose the best collection to store that. Books class having
//		the attributes as bookId(Unique_id),bookName,BookAuthor Main Runner class.
//
//Display the list of books while demonstrating duplicate books(i.e. Books with same id)
//are not entered. Note: Books can have the same bookName,BookAuthor but not bookId.


package com.que1;

public class Library {

	private  int bookId;
	private  String bookName;
	private String bookAuthor;
     
     
     
     //Parameterized constructor
     public Library(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
     
     public Library() {
 		super();
 	}
	

	//if it is equal return true otherwise false
	@Override
	public boolean equals(Object o) {
		if(this.bookName == o) {
			return true;
		}
		Library lb1 = this;
		Library lb2 = (Library)o;
		
		return lb1.bookId == lb2.bookId && lb1.bookName.equals(lb2.bookName) &&  lb1.bookAuthor.equals(lb2.bookAuthor);
		
	}

	
	//remove the duplicate element
		@Override
		   public int hashCode(){
			
		   	  return this.bookId;
		  }

	
	
  //getter n setter 
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	
//the way to print output
	@Override
	public String toString() {
		return "bookId = " + getBookId() + ", bookName = " + getBookName() + ", bookAuthor = " + getBookAuthor() ;
	}
   

	
}
