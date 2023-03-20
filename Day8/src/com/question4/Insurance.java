package com.question4;

import java.util.Scanner;

public class Insurance {
        double calculateAverage(int[] age) {
      	
        	 int Age =0;
        	 for(int i : age) {
        	   if(i>=28 && i<=40) {
        		   Age +=  i;
        	   }
        	 }
        	 //calculate average and return;
			return (double)(Age/age.length);
         }
         
         public static void main(String[] args) {
			Insurance i1 = new Insurance();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter total no.of employees:");
			int noofemp = sc.nextInt();
			
			// Minimum of 2 employees is mandatory to calculate average age, if fails, the output
			//should be "Please enter a valid employee count"
			if(noofemp<2) {
				System.out.println("Please enter a valid employee count");
			}
			else {
				//age.length===count..enter the noofemp for calculating
				//average age of that number of person
				int[] age= new int[noofemp];
				System.out.println("Enter the age for "+ noofemp + " employees");
				
				for(int i = 0 ;i<noofemp  ;i++) {
					//enter the age
					age[i]=sc.nextInt();
				}
				double Avgage = i1.calculateAverage(age);
				
				if(Avgage == -1) {
					System.out.println("Invalid age encountered!");
					
				}
				else {
					System.out.println("The average age is "+Avgage);
				}
			}
			sc.close();
			
		}
}
