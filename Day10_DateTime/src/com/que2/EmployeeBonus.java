package com.que2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class EmployeeBonus {
	public double Employee(String joinDate)  throws InvalidAge{
	
	try {
		LocalDate d1 = LocalDate.parse(joinDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate c1= LocalDate.now();
		if(d1.isBefore(c1)) {
			int yeardif = (int) ChronoUnit.YEARS.between(d1,c1);
			long mondif = ChronoUnit.MONTHS.between(d1, c1);
			
			//System.out.println(yeardif);
			
			if(mondif <=12 ) {
				return 5000;
			}
			else if(yeardif > 1 && mondif<=12) {
				return 8000;
			}
			else if(yeardif > 2) {
				return 10000;
			}
		}
		else {
			InvalidAge ia = new InvalidAge("Age should not be in the future");
			throw ia;
		}
	}catch(Exception e) {
		InvalidAge  ia = new InvalidAge("Please pass the date in the correct format");
		throw ia;
	}
	return 0;
		
	}
	

}