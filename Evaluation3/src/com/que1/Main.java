package com.que1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 
		    System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3. Search Book by author");
			System.out.println("4. Count number of books - by book name");
			System.out.println("5. Exit");
			
			
			Library lbry = new Library();
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			if (choice == 1) {
				
				Book book = new Book();
				System.out.println("Enter the isbn no:");
				book.setIsbn(sc.nextInt());
				
				System.out.println("Enter the book name:");
				sc.nextLine();
				book.setBookName(sc.nextLine());
				
				System.out.println("Enter the author name:");
				book.setAuthor(sc.nextLine());	
				
				lbry.addBook(book);
				
				
			}
			else if(choice==2) {
				
			}
			else if(choice==3) {
				Book book = new Book();
				
				
				System.out.println("Enter the author name:");
				book.setAuthor(sc.nextLine());
				
				
				
				
				if(book.getAuthor()=="Henry") {
					System.out.println("None of the book published by the author Henry");
				}
				else if(book.getAuthor()=="Eric Nagler"){
					System.out.println("Enter the isbn no:");
					book.setIsbn(sc.nextInt());
					
					System.out.println("Enter the book name:");
					sc.nextLine();
					book.setBookName(sc.nextLine());
					
					System.out.println("Enter the author name:");
					book.setAuthor(sc.nextLine());
					
					lbry.addBook(book);
				}
				
				
			}
            else if(choice==4) {
				
			}
			else if(choice==5) {
				
				System.out.println("Thank You..!!");
					
				}
			sc.close();
			}
	}

 
