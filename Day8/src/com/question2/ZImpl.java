package com.question2;



public class ZImpl implements Z{
    //x abstract method
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1(X)inside the ZImpl");
	}
	
	
	
	
	//Y abstract method
	@Override
	public void method4() {
		// TODO Auto-generated method stub
	System.out.println("method4(Y)inside the ZImpl");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("method(Z)inside the ZImpl");
	}

	
	public static void main(String[] args) {
		ZImpl d1  = new ZImpl();
		d1.method1();//ZImpl
		d1.method();//ZImpl
		d1.method2();//Z
		d1.method4();//ZImpl
		d1.method5();
		
		
		
	}

}
