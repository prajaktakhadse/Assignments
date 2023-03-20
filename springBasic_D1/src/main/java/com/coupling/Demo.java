package com.coupling;

public class Demo {
      Shapes s;//it is the dependency here we can store one of its implemented class obj.

	public void setS(Shapes s) {
		this.s = s;
	}
 
      public void display() {
    	  s.call_shapes();
    	
      }
      
      
}
