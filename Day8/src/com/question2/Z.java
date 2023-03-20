package com.question2;

public interface Z  extends X ,Y{
   
	// place another abstract method inside this Z interface.
    public abstract void method();
	
  //default method of X should be overridden whereas the default method of Y
  	//should not be overridden inside the implementation class
      @Override
      public default void method2() {
      	System.out.println("method2() is inside the Z");
      }
  	

}
