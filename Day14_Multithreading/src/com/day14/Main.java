package com.day14;

public class Main {
	public static void main(String[] args) throws Exception {
		   //create the obj
		Demo t1 = new Demo();
		 
		 
		 //create the thread
		 
		 Thread t =new Thread(t1);
		 
		 //start the execution
		 t.start();
		 
		 synchronized (t1) {
			t1.wait(1000);
			
			System.out.println("Product of 10 digits: "+ t1.prod);
		}
		
      }
  }

