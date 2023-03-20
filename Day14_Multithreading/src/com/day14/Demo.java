package com.day14;

public class Demo extends Thread{
      //overide the run method
	int prod =1;
	   @Override
	   public void run() {
		  synchronized (this) {
			  for(int i = 1 ;i<=10 ;i++) {
				   prod = prod *i;
			   }
			   notify();
		}
		   
	   }
	   
	   
}
