//Write a non-static method inside a java class that accepts a whole number and prints
//the same number if the input is Odd. If the input is even, it should print the next multiple
//of ten. If the input is negative, print the string: “Error”.
//Input: 44, output: 50
//Input: 45, output: 45
//Input: -5, output: Error

package com.Day4;

public class EvenOdd {
   public void Check(int x) {
	   if(x<0) {
		   System.out.println("Error");
	   }
	   else if(x%2==1) {
		   System.out.println(x);
	   }
	   else if(x%2==0){
           while(x%10!=0) {
        	  x = x+2;
           }
           System.out.println(x);
	   }
   }
   
   public static void main(String[] args) {
	 EvenOdd f1 = new EvenOdd();
	 f1.Check(44);
}
}
