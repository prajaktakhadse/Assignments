//Create a class Ticket with the following variables
// int ticketid;
// int price;
// int availableTickets;
//Include getters and setters methods in the Ticket class.
//availableTickets should hold only positive value. Zero and negative values are not
//allowed.(This logic should be checked inside the corresponding setter method)
//Write the following method in the Ticket class:
//public int calculateTicketCost(int nooftickets); This method should check the ticket
//availability, If the tickets are available, reduce the nooftickets from availableTickets and
//calculate the total amount as nooftickets*price  and return the total amount.  If the
//tickets are not available, this method should return -1.
//Write a main method in the Main class to test the application.
//Sample input and output
//Evaluation C2: 4
//Enter no of bookings:
//2
//Enter the available tickets:
//25
//Enter the ticketid:
//123
//Enter the price:
//100
//Enter the no of tickets:
//5
//Available tickets: 25
//Total amount:500
//Available ticket after booking:20
//Enter the ticketid:
//124
//Enter the price:
//100
//Enter the no of tickets:
//2
//Available tickets: 20
//Total amount:200
//Available ticket after booking:18
package com.masai;

public class Ticket {
 private int ticketId;
 private int price;
 private int availableTickets;
 
 
 //getter n setter methods
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAvailableTickets() {
	return availableTickets;
}
//check whether it hold the positive or not
public void setAvailableTickets(int availableTickets) {
	if(availableTickets>0) {
	this.availableTickets = availableTickets;
	}
	else {
		System.out.println("Tickets are not available");
	}
}

//check the ticket availability,

public int calculateTicketCost(int nooftickets) {
	if(nooftickets<=getAvailableTickets()) {
		setAvailableTickets(getAvailableTickets() - nooftickets);
		 int total = nooftickets*getPrice();//calculate the amount
			return total;
		}
		else {
			return -1;//if not available
		}

	}
public static void main(String[] args) {
	
}

 
 
 
  
}
