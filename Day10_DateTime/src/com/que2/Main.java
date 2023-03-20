package com.que2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    EmployeeBonus eb = new EmployeeBonus();
	    
	    System.out.println("Enter the joindate");
	    String join  = sc.next();
         try {
			
			System.out.println("Your Bonus Amount:"+ eb.Employee(join));
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	sc.close();
	}

    
   
}
