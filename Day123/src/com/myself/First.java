package com.myself;

public class First {
  public static void prime(int x) {
	  
			if( x<2 || x>100) { 
				 System.out.println("Invalid Number");
			}
			else {
				for(int i=1;i<=x;i++) {
					if(x%i==0)
					System.out.println(i);
				}
			}
  
  }
	public static void main(String[] args) {
		int x =120;
		prime(x);
	}
		
	
}
