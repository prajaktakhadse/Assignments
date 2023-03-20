//Define an interface X with:
//one abstract method
//one default method
//one static method
//Define an interface Y with:
//one abstract method
//one default method
//one static method
//Define another interface Z which extends both the interfaces X and Y:
//And place another abstract method inside this Z interface.
//Create a class ZImpl as the implementation of the Z interface.
//from the main method of the Demo class call the methods of interface X, Y, Z.
//Note: default method of X should be overridden whereas the default method of Y
//should not be overridden inside the implementation class.

package com.question2;

public interface X {
	//one abstract method
    public abstract void method1();
    
    
    //one default method
    public default void method2() {
    	System.out.println("method2() is inside the X");
    }
    
    //one static method
    public static void method3() {
    	System.out.println("method3() inside X");
    }
  
}
