package com.revision;

import java.util.Scanner;

public class Fact2 {
    
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int no = sc.nextInt();
		
		if(no < 10) {
			  int fact=1;  
			  
			  for(int i=1;i<=no;i++){    
			      fact=fact*i;    
			  } 
			  
			  System.out.println("Factorial of "+no+" is: "+fact);
		}
		
		
		
		else if(no >= 10 && no < 100){
	
			
			int fir = no%10;
			
			int sec = no/10;
			
			if(fir > sec) {
				int diff = fir - sec;
				
				  int fact=1;  
				  
				  for(int i=1;i<=diff;i++){    
				      fact=fact*i;    
				  } 
				  
				  System.out.println("Factorial of "+no+" is: "+fact);
			}
			else {
				int diff = sec - fir;
				
				  int fact=1;  
				  
				  for(int i=1;i<=diff;i++){    
				      fact=fact*i;    
				  } 
				  
				  System.out.println("Factorial of "+no+" is: "+fact);
			}
			
		}
		
		else {
			System.out.println("Error");
		}
		
		sc.close();

	  }  
		  
}
