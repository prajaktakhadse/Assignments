package com.que2;

import java.util.TreeSet;
import java.util.Comparator;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main implements Comparator<Members>{
	
	@Override
	public int compare(Members m1, Members m2) {
		
		if(m1.getMemberId() == m2.getMemberId()) return 0;
		if(m1.getMembershipNo() == m2.getMembershipNo()) return 0;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate membershipEnddate1 = LocalDate.parse(m1.getMembershipEndDate(), dtf);
		LocalDate membershipEnddate2 = LocalDate.parse(m2.getMembershipEndDate(), dtf);
		
		if(membershipEnddate1.isBefore(membershipEnddate2)) {
			return -1;
		}
		else return 1;
	}



      public static void main(String[] args) {
		TreeSet<Members> tm = new TreeSet<>(new Members());
		
 
		tm.add(new Members(2, "pratham" ,102 , "12-08-2025"));
		tm.add(new Members(2, "Mansi"   ,103 , "15-01-2021"));
		tm.add(new Members(3, "Sakshi"  ,104 , "11-06-2020"));
		tm.add(new Members(4, "Pari"    ,105 , "11-05-2026"));
		tm.add(new Members(5, "Praju"   ,106 , "11-05-1999"));
		
		System.out.println(tm);
	}
}
