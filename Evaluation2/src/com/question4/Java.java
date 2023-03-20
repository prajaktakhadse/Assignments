package com.question4;

public abstract class Java {
	
	//final field
		final int number ;
		 public Java(int number){
			super();
			this.number = number;
		}
    
	//method1(): void
	public abstract void method1() ;
	
	
	//method2(): void
    final void method2() {
		System.out.println("Inside method 2");
	}
    
    
	//method3(): void
	public void method3() {
		System.out.println("Inside method3");
	}
	


	
}
