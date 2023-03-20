////Create a Java class with a single method 
//that can accept the name of a Mobile
//company and any number of its model names.
//inside the method print the mobile Company name and all its supplied models.
//Note: The user can supply any number of model names, even the user can supply only
//the company name without its model also.
//Inside the same class initialize an String array with following models:
//String[] outdatedModels = {"note4","note5","note6","note7"};
//If user supplied mobile model matches with any of the above outdated models, then
//print that model name postfix with 
//OUTDATED word example(note4_OUTDATED)
package com.question3;

import java.util.Scanner;

public class Java { 
	   String[] outdatedModels = {"note4","note5","note6","note7"};
      

	   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Java j1 = new Java();
		 //j1.displayMobile(mobileCompany,mobileModels)); 
		 System.out.println("Enter the mobile company:-");
		 String mob = sc.nextLine();
		 
		 
		 System.out.println("Enetr the model number:-");
		 String modelnum = sc.nextLine();
		 
		 
		 System.out.println("*******************");
		 
		
         if(modelnum.isEmpty()) {
        	 System.out.println("Mobile Company:-"+mob);
         }
         
         else {
	        	 System.out.println("Mobile Company:-"+mob);
	        	 boolean tp = true;
	 			
	 			
	 			for(String i: j1.outdatedModels)
	 				
		 				if(modelnum.equalsIgnoreCase(i))
		 				{
		 					System.out.println("Model Name : " + i + "_OUTDATED");
		 					tp = false;
		 					break;
		 				}
	 				
	            }
	 			if(tp == true)
					System.out.println("Model Name : " + modelnum);
				
			
		}
         sc.close();
}

}
