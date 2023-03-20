package com.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	 
		Demo d1 = ctx.getBean("demo",Demo.class);//done with demo obj through spring core
		
		d1.display();
	}
}
