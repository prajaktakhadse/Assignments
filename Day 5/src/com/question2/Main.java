

package com.question2;

import java.util.Scanner;



public class Main {
	  public static void main(String[] args) {
	     Ticket tick = new Ticket();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter no of bookings:");
		 int book =sc.nextInt();
		 
		 
		 System.out.println("Enter the available tickets:");
		 int avble = sc.nextInt();
		 Ticket.setAvailabletickets(avble);
		 
		 for(int i = 0 ;i<book;i++) {
			 System.out.println("Enter the ticketid:");
			 int id = sc.nextInt();
			 tick.setTicketid(id);
			 
			 
			 System.out.println("Enter the price:");
			 int mrp = sc.nextInt();
			 tick.setPrice(mrp);
			 
			 System.out.println("Enter the no of tickets:");
			 int ticket = sc.nextInt();
		 
		
	
		 
		 
		System.out.println("Total amount:-"+tick.calculateTicketCost(ticket));
		System.out.println("Available ticket after booking:"+Ticket.getAvailabletickets());
		 System.out.println("----------");
		 }
		 sc.close();
		
	 }
 
        
   
}
