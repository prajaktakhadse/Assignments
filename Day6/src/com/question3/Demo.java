package com.question3;
import java.util.Scanner;
public class Demo{
	public static Bank getBank(String bank) {
		
		if(bank.equalsIgnoreCase("axis")) {
			Scanner sc = new Scanner(System.in);
	     	AxisBank ab  = new AxisBank();
	     	
	     	System.out.println("Enter the AxisBank Detail:-");
	     	
	     	System.out.println("Enter the branchName:-");
	     	String bname = sc.nextLine();
	     	ab.setBranchName(bname);
	     	
	     	
	     	System.out.println("Enter  the IFSCCode:-");
	     	String bcode = sc.next();
	     	ab.setIfscCode(bcode);
	     	
	     	System.out.println("Enter RateOfInterest:-");
	     	double rate = sc.nextDouble();
	     	ab.setRateOfInterest(rate);
	     	
	     	sc.close();
		     return ab;
		}
		
		
		
		 if(bank.equalsIgnoreCase("ICICI") ) {
			Scanner sc = new Scanner(System.in);
			ICICIBank ib = new ICICIBank();
			
	     
	     	System.out.println("Enter the ICICIBank Detail:-");
	     	
	     	System.out.println("Enter the branchName:-");
	     	String iname = sc.nextLine();
	     	ib.setBranchName(iname);
	     	
	     	
	     	System.out.println("Enter  the IFSCCode:-");
	     	String icode = sc.next();
	     	ib.setIfscCode(icode);
	     	
	     	System.out.println("Enter RateOfInterest:-");
	     	double irate = sc.nextDouble();
	     	ib.setRateOfInterest(irate);
	     	
	     	sc.close();
			return ib;
		}
		return null;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the bank");
		String bn =sc.next();
		
		Bank get = Demo.getBank(bn);
       if(get instanceof AxisBank) {
    	   get.displayDetails();
    	   ((AxisBank) get).getCreditCard();
       }
       else if(get instanceof ICICIBank) {
    	   get.displayDetails();
       }
       else {
    	   System.out.println("Invalid Bank");
       }
		
		sc.close();
		
		
	}
}
