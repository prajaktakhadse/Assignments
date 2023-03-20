//Assume you have access to two boolean variables, isSnowing, and isRaining, and 
//one double variable, temperature. isSnowing is true when it's snowing and false otherwise,
//isRaining is true when it's raining and false otherwise, and temperature gives the outdoor 
//temperature in degrees Fahrenheit. Write code that prints: “Let's stay home." if it's raining, snowing, 
//or below 50 degrees Fahrenheit (10 degrees Celsius), and prints: Let's go out!" otherwise.

package com.day3;

public class Wheather {
       public static void Check(boolean isSnowing ,boolean isRaining , double x)  {
    	   if(isSnowing == true|| isRaining ==true || x<50){
    		   System.out.println("Let’s stay home.");
    	   }
    	   else {
    		   System.out.println("Let's go out!");
    	   }
       }
       
       public static void main(String[] args) {
		boolean isSnowing = true;
		boolean isRaining = false;
		double x = 50;
		Check(isSnowing,isRaining,x);
		
	}
}
