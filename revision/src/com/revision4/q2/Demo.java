package com.revision4.q2;

public class Demo {
	  public static void main(String[] args) {
		Z objZ = new ZImpl();
		
		objZ.bike();
		objZ.fun2();
		objZ.fun1();
		
		
		System.out.println("--------------------------------------------");
		
		Y objY = (Y)objZ ;
		objY.fun1();
		objY.fun2();
		Y.fun3();
	
		
		System.out.println("----------------------------------------------");
			
		X objX = (X)objY;
		objX.fun1();
		objX.fun2();
		X.fun3();
		
		System.out.println("-----------------------------------------------");
		
	}
}
