package com.revision4.q6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	 public static void main(String[] args) {
	
         Demo d = new Demo();
         
        
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the name :-" );
		  String name = sc.next();
	      d.cz.setName(name);
		  
		  System.out.println("Enter the adharNumber :-" );
		  String aadhar = sc.next();
		  d.cz.setAadharNumber(aadhar);
		  
		  System.out.println("Enter the mobileNumber :-" );
		  String mob = sc.next();
		  d.cz.setMobileNumber(mob);

		  sc.close();
	   }
    Citizen cz = new Citizen();
	
	public  boolean validate(String name1, String mobileNum, String aadharCard) {
		
	  if(Pattern.matches("[a-zA-Z]{3,8}", name1)&& Pattern.matches("[0-9]{12}", aadharCard)&& Pattern.matches("[6789][0-9]{10}", mobileNum)) {
		  
				  System.out.println("Citizen Details:-");
				  System.out.println("Name : "+ cz.getName() );
				  System.out.println("AdharNumber :"+ cz.getAadharNumber());
				  System.out.println("MobileNumber"+ cz.getMobileNumber());
			}
		  else {
			  System.out.println("invalid adharnumber.");
		  }
	 
	
	  return false;
}
   
	
	 
}
