package com.que3;

public class Main {
		public static void main(String[] args) {
				
				Common c1 = new Common();
				Common c2 = new Common();
				
				CommanThread ct1 = new CommanThread(c1, "abc");
				CommanThread ct2 = new CommanThread(c2, "xyz");
				
				Thread t1 = new Thread(ct1, "def");
				Thread t2 = new Thread(ct2, "stu");
				
				t1.start();
				t2.start();
				
				
			}
}
