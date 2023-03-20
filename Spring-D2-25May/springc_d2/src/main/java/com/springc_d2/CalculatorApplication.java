package com.springc_d2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class CalculatorApplication {
    
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CalculatorController c = ctx.getBean("calculatorController",CalculatorController.class);
		
		System.out.println(c.sum());
		System.out.println(c.multi());
		System.out.println(c.sub());
		((ClassPathXmlApplicationContext)ctx).close();
		
   }
}