package com.masai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Ticket t1 = new Ticket();
		   Scanner sc =new Scanner(System.in);
		  
		  System.out.println("Enter the no of bookings"); 
		  int book =sc.nextInt();
		  
		  System.out.println("Enter the available Tickets");
		  
			int avble = sc.nextInt();
			
			while(avble < 0) {
				System.out.println("Tickets not available");
				avble = sc.nextInt();
			}
			t1.setAvailableTickets(avble);
			 
			 for(int i = 0 ;i<book;i++) {
				 System.out.println("Enter the ticketid:");
				 int id = sc.nextInt();
				 t1.setTicketId(id);
				 
				 
				 System.out.println("Enter the price:");
				 int mrp = sc.nextInt();
				 t1.setPrice(mrp);
				 
				 System.out.println("Enter the no of tickets:");
				 int ticket = sc.nextInt();
			 
			
		
			 
			 System.out.println("Available Tickets:-"+t1.getAvailableTickets());
			System.out.println("Total amount:-"+t1.calculateTicketCost(ticket));
			System.out.println("Available ticket after booking:"+t1.getAvailableTickets());
			 System.out.println("----------");
			 }
			 sc.close();
			
		 }
	 
		  
	}
  
   

  

