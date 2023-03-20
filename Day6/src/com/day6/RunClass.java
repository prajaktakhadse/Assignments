package com.day6;
import java.util.Scanner;
public class RunClass extends Student {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  
		 //RunClass Object
		RunClass rc = new RunClass();
		System.out.println("Enter the student Name:");
		String name = sc.next();
		rc.setStudName(name);
		  
		  
		System.out.println("Enter the student ID:");
	    int id = sc.nextInt();
		rc.setStudId(id);
	  
		System.out.println("Enter the Exam Fee:");
	    double efee = sc.nextDouble();
		rc.setExamFee(efee);;
	
		System.out.println("-----------DayScholar Fee----------");
		//DayScholar object
		DayScholar ds = new DayScholar();
		System.out.println("Enter the Transport Fee amount to be paid: ");
		double tf = sc.nextDouble();
		ds.setTransportFee(tf);
		
		System.out.println("DayScholar Fees paid:");
		double dsf = sc.nextDouble();
	    double rem = ds.payFee(dsf);
	    ds.setStudName(name);
	    ds.setStudId(id);
	    ds.displayDetails();;
		System.out.println("Remaining amount to be paid:"+rem);
		
		
		System.out.println("-----------Transport Fee----------");
		//Hosteller object
		Hosteller hs = new  Hosteller();
		System.out.println("Enter Hostel Fee:");
		double hfee = sc.nextDouble();
		hs.setHostelFee(hfee);
		
		
		System.out.println("Enter the Hostel Fee amount to be paid: ");
		double hf = sc.nextDouble();
		double hfrem = hs.payFee(hf);
		 hs.setStudName(name);
		 hs.setStudId(id);
		 hs.displayDetails();
		System.out.println("Remaining amount to be paid:"+ hfrem);
		
		 
	
		sc.close();
	}
}
