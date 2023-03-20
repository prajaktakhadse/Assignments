package com.masai.demo;

public class Books {
	
	    Integer book_Id;
		String name;
		String author;
		Integer price;
		
		
		public Books() {
			super();
		}


		public Books(Integer book_Id, String name, String author, Integer price) {
			super();
			this.book_Id = book_Id;
			this.name = name;
			this.author = author;
			this.price = price;
		}


		public Integer getBook_Id() {
			return book_Id;
		}


		public void setBook_Id(Integer book_Id) {
			this.book_Id = book_Id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public Integer getPrice() {
			return price;
		}


		public void setPrice(Integer price) {
			this.price = price;
		}


		@Override
		public String toString() {
			return "Books [Book_Id=" + book_Id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
		}
		
		
	

}
