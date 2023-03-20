package com.revision2.q5;

final class Child extends Parent {
   @Override
   public void method1(int num) {
	   System.out.println("this method1() belongs to child class"+ num);
   }
   
   @Override
   public void method3() {
	   System.out.println("this method3() belongs to child class");
   }
	 
   
   public void method4() {
		System.out.println("this method4() belongs to parent class");
	}
	
}
