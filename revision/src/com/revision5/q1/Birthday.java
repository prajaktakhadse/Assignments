package com.revision5.q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetrr the date of birth : ");
		String Dob = sc.next();
				
				
			try {
					LocalDate d1 = LocalDate.parse(Dob , DateTimeFormatter.ofPattern("dd-mm-yyyy"));
					LocalDate d2 = LocalDate.now();
					
				Period p = Period.between(d1, d2);
				
				if(d1.getYear() >  d2.getYear()) {
					System.out.println("Date of birth should not be in future");
				}
				
                else if(p.getYears()== 0){
					 System.out.println("please pass the date in the proper format");
				}
				
				else if(p.getYears() >= 18) {
					if(d1.getDayOfMonth() == d2.getDayOfMonth()&& d1.getMonth().equals(d2.getMonth())) {
						System.out.println("Happy Birthday, You are eligible to cast your vote");
					}
					else {
						System.out.println("You are eligible to cast your vote");
                    }
				}
				
					
			}
		  catch(Exception e){
					 System.out.println("please pass the date in the proper format");
				}
			sc.close();
	}
}
