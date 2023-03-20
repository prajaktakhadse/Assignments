//Write a method that accepts the date of birth from the user in the String form and
//returns the age of the user, If the supplied date is in the future then print the message:
//“Date should not be in Future”. and if the user will supply an invalid date format then
//throw a checked exception (User-defined exception) called “InvalidDateFormat”
//exception.
//Call this method from the main method and display the appropriate result by handling
//the “InvalidDateFormat” exception.
//Note: The application should not terminate abnormally.


package com.que1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DOB {
        public int check(String date)throws InvalidDateFormat {
			try {
				LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				LocalDate c1 = LocalDate.now();
				Period p = Period.between(d1, c1);
				return p.getYears();
			}catch(Exception e) {
				throw new InvalidDateFormat("Invalid Date Format");
			}
        	
        }
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your DOB in dd-MM-yyyy");
			String dob= sc.next();
			DOB d1 = new DOB();
			
			try {
				int age = d1.check(dob);
				if(age>0) {
					 System.out.println("Your age is:"+age);
				}
				else {
					System.out.println("Date should not be in Future");
				}
			}catch(InvalidDateFormat i) {
				System.out.println(i.getMessage());
			}
			sc.close();
		}
}
