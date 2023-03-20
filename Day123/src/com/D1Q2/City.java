//Write a static method that will take a city as a parameter: and implement this method as follows:
//if city.equals("Mumbai") then print
//	"Financial city"
//if city.equals("Kolkata") then print
//	"City of Joy"
//if city.equals("Delhi") then print
//	"Capital of the country"
//if city.equals("Bangalore") then print
//	"Cyber City"
//otherwise
//	"May be Other Indian City"
//This method should be implemented using switch-case
//Call the above method from the main method by supplying a proper city name.



package com.D1Q2;

public class City {
   public static void place(String city) {
	   switch (city) {
	   case"Mumbai":
		   System.out.println("Financial City");
		   break;
	   case"Kolkata":
		   System.out.println("City of the joy");
		   break;
	   case"Delhi":
		   System.out.println("Capital of the country");
		   break;
	   case"Banglore":
		   System.out.println("Cyber City");
		   break;
	   default:
		  System.out.println("May be Other Indian City");
	   }
   }
   public static void main(String[] args) { 
	   place("Delhi");
}
}
