//Create a class Ticket with the following private variables int ticketid; int price; static int
//availableTickets; Include getters and setters methods in the Ticket class.
//AvailableTickets should hold only positive value. Zero and negative values are not
//allowed.(This logic should be checked inside the corresponding setter method)
//Write the following method in the Ticket class:
//public int calculateTicketCost(int nooftickets) — this method should check the ticket
//availability, If the tickets are available, reduce the nooftickets from availableTickets and
//calculate the total amount as nooftickets*price  and return the total amount.  If the
//tickets are not available, this method should return -1.
//Write a main method in the Main class to test the application
//Sample input and output
//Enter no of bookings: 2 Enter the available tickets: 25 Enter the ticketid: 123 Enter the
//price: 100 Enter the no of tickets: 5 
//Total amount:500
//Available ticket after booking:20
//Enter the ticketid: 124 Enter the price: 100 Enter the no of tickets: 2 Available tickets: 20
//Total amount:200
//Available ticket after booking:18

package com.question2;

public class Ticket {
	
private int ticketid;
private int price;
private static int availabletickets;


//getter and setter method
public int getTicketid() {
	return ticketid;
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public static int getAvailabletickets() {
	return availabletickets;
}
//check the ticket availability
public static void setAvailabletickets(int availabletickets) {
	if(availabletickets>0) {
		Ticket.availabletickets = availabletickets;
	}
	else {
		System.out.println("tickets not available");
	}
}
//check the number of tickets
public int calculateTicketCost(int nooftickets) {
	//check whether available or not
	if(nooftickets<=getAvailabletickets()) {
		 setAvailabletickets((getAvailabletickets()-nooftickets));
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
