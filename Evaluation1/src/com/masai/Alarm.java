//ALARM CLOCK
//Write a class called AlarmClock, in which define a non-static method that will take 2 parameters:
//
//The first value is a number between 0 to 6. This number indicates the day of the week with 0 being Sunday and 6 being Saturday.
//The second value is a boolean which is either true or false. If it is true, then it means that it is vacation time. If it is false then it is not vacation time.
//Using these arguments print the following from the method:
//
//If it is a vacation and weekday, print “10:00” as output.
//If it is a vacation and weekend, print “off” as output.
//If it is not a vacation and weekday, print “7:00” as output.
//If it is not a vacation and weekend, print “10:00” as output.
//If the first value is not a number between 0 and 6 OR the second value is not true or false, then print “error.
//Call this method from the main method to test the functionality.
package com.masai;

public class Alarm {
	void clock(int x,boolean work) {
		if(x==0||x==1||x==2||x==3||x==4||x==5||x==6||work==true||work==false) {
	if(x==0 && work==true) {
		System.out.println("10.00");
	}
	else if(x == 1 && work ==true) {
		System.out.println("10.00");
	}
	else if(x == 2 && work ==true) {
		System.out.println("10.00");
	}
	else if(x == 3 && work ==true) {
		System.out.println("10.00");
	}
	else if(x == 4 && work ==true) {
		System.out.println("10.00");
	}
	else if(x == 5 && work ==true) {
		System.out.println("10.00");
	}
	else if(x == 6 && work ==true) {
		System.out.println("10.00");
	}
	
	else if(x == 1 && work ==false) {
		System.out.println("7.00");
	}
	else if(x == 2 && work ==false) {
		System.out.println("7.00");
	}
	else if(x == 3 && work ==false) {
		System.out.println("7.00");
	}
	else if(x == 4 && work ==false) {
		System.out.println("7.00");
	}
	else if(x == 5 && work ==false) {
		System.out.println("7.00");
	}
	
	else if(x == 0 && work ==false) {
		System.out.println("10.00");
	}
	else if(x == 6 && work ==false) {
		System.out.println("10.00");
	}
}	
else {
		System.out.println("error");
	
	}
}
	
	 public static void main(String[] args) {
		int x = 1;
		boolean work = false;
		Alarm d1 = new Alarm();
		d1.clock(x, work);
		
	}

}

