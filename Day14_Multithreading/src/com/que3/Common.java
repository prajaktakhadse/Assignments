package com.que3;

public class Common {
	public void fun1(String name) {
		synchronized(Common.class) {
			System.out.println("Welcome to Common class. Thread: " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Goodbye " + name);
		}
	}
}

