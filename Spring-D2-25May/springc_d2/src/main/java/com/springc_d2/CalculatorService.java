//Q1 Create a spring project named calculator class with service layer and
//presentation layer.All the calculations are to be performed in the service
//class (i.e sum, multiplication,subtraction).
//And the presentation layer should only be responsible for returning the
//result to the main Runner class.


package com.springc_d2;

import org.springframework.stereotype.Service;

@Service(value = "c1")
public  class CalculatorService {
     
	public  int sum(int a,int b) {
		return (a+b);
	}
	public  int multi(int a,int b) {
		return (a*b);
	}
	
	public  int sub(int a,int b) {
		return Math.abs(a-b);
	}
	
}
