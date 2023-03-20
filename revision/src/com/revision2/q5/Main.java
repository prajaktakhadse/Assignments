package com.revision2.q5;

import java.util.Scanner;

public class Main {
		  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		
		   System.out.println("Enter positive number:");
			int num = sc.nextInt();
			Parent p = new Parent();
			if(num >1 && num<10) {
				//Parent p = new Parent();
				int n = p.getNumber();
				System.out.println(n);
			}
			else {
	            System.out.println("Invalid Number");
			}
			
			
			Child c = new Child();
			 c.method1(num);
			
			 p.method1(num);
			 
			 p.method2();
			 p.method3();
			 ((Child) p).method4();
			
			sc.close();
		}
}
