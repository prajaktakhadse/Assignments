package com.question4;

import java.util.Scanner;

public final class Child extends Java{

	public Child(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		System.out.println("This is inside child");
		System.out.println("The Number is : " + number);
	}
	
	public void method4() {
		System.out.println("This is inside child method 4");
	}
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);		
		
		
		System.out.println("Enter the value");
		
		int num = scn.nextInt();
		
		while(num < 0 || num >= 10 ) {
			System.out.println("Enter the value in between 1 to 10");
			num = scn.nextInt();		
		}
		
		Java j1 = new Child(num);
		
		j1.method1();
		j1.method2();
		j1.method3();
		
		
		Child c1 = (Child)j1;
		
		c1.method4();
		
		scn.close();
		
	}
	
	
}