package com.revision4.q2;

public interface X {
   void fun1();
  
   default void fun2() {
	   System.out.println("default method inside the interfaceX ");
}
  
  public  static void  fun3() {
	   System.out.println("static method inside the interfce X");;
   }
}
