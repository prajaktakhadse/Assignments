           package com.que2;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Demo {
	public static void main(String[] args) {
		 Customer cus =  new Customer();
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Enter userName");
		 String name =  sc.next();
		 cus.setUsername(name);
		 
		 System.out.println("Enter Password");
		 String pass = sc.nextLine();
		 cus.setPassword(pass);
		 
		 System.out.println("Enter mobile number");
		 String mobnum = sc.nextLine();
		 cus.setMobileNumber(mobnum);
		 
		 System.out.println("Enter Email");
		 String Email = sc.nextLine();
		 cus.setEmail(Email);
		 
		 System.out.println("_________________");
		 
		 if(Pattern.matches("[a-zA-Z]{3,8}",name)) {
			 if(Pattern.matches("[a-zA-z0-9]{3,8}",pass)) {
				 if(Pattern.matches("[6789][0-9]{9}", mobnum)) {
					 if(Pattern.matches("[a-z0-9]+@[a-z]+.[a-z]{2,3}", Email)) {
						 System.out.println("Username:-"+ cus.getUsername());
						 System.out.println("Password:-"+ cus.getPassword());
						 System.out.println("MObile No.:-"+ cus.getMobileNumber());
						 System.out.println("Email:-"+cus.getEmail());
					 }else {
						 System.out.println("please provide valid Email");
					 }
				 }else {
					 System.out.println("please enter valid number");
				 }
			 }else {
				 System.out.println("Incorrect password");
			 }
		 }else {
			 System.out.println("Invalid Username");
		 }
		 sc.close();
	}
   
 
}
