package com.question2;

public interface Y {
	//one abstract method
    public abstract void method4();
    
    
    //one default method
    public default void method5() {
    	System.out.println("method5() is inside the X");
    }
    
    //one static method
    public static void method6() {
    	System.out.println("method6() inside X");
    }
}
