package com.que3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	
	

	public static void main(String args[]) {
		try {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		
		
		int num3 = num1 / num2;
		
		
		String message = null;
		if(num3 > 10){
		  message = "Welcome to Exception Handling ";
		}
	
		//
		
		System.out.println("Message is :"+ message.toUpperCase());
		sc.close();
		
		}catch(InputMismatchException e){
			System.out.println("Please enter the valid number");
		}
		catch(ArithmeticException ae) {
			System.out.println("num2 should not be 0");
		}catch(NullPointerException ne) {
			System.out.println("String value is null");
		}
	System.out.println("end of main");
	
	}
}

