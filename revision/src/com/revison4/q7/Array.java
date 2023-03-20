package com.revison4.q7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enetr the size:-");
	   int arr = sc.nextInt();
	   
	   int[] array = new int[arr];//allocating the memory of array by user.
	   //System.out.println("hello");
	   try {
		 for(int i = 0; i< arr ;i++) {
			 array[i] = sc.nextInt();//write the element
		 
		 } 
			
		
		 System.out.println("Enter the index of the array element you want to access:-");
		 int index = sc.nextInt();
		 
		 System.out.println("The array element at index "+index+"=" + array[index]);
		 
	   }
	   catch (ArrayIndexOutOfBoundsException e) {
	   System.out.println("java.lang.ArrayIndexOutOfBoundsException");

	}catch(InputMismatchException e) {

		System.out.println("java.util.InputMismatchException");

	}
	
	sc.close();
   }
}

