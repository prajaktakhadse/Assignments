package com.que3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
      public static void main(String[] args) {
    	  Scanner sc  =  new Scanner(System.in);
    	  
    	  
    	  
		TreeSet<Java> ts = new TreeSet<>();
		
		for(int i =1 ;i<=4 ;i++) {
			System.out.println("Emp id: ");
			int id = sc.nextInt();
			
			System.out.println("Emp Name: ");
			String name = sc.next();
			
			System.out.println("Emp Salary: ");
			double sal = sc.nextDouble();
			
			ts.add(new Java(id,name,sal));
			
			System.out.println("*******************");
			
		}
		 
		for(Java E1 : ts) {
			
			System.out.println(E1);
			System.out.println("-------------------");
			
		}
		sc.close();
	}
}
