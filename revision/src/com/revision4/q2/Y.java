package com.revision4.q2;

public interface Y {
      void fun1() ;
     
    default void fun2() {
    	System.out.println("default method inside interfaceY"); 
	}
     
    public static void fun3() {
    	 System.out.println("static method inside interfaceY"); 
     }
}
