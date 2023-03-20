package com.springc_d2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
	
	//object................
	@Autowired
	CalculatorService calculateService;
   
	public int sum() {
    	   return calculateService.sum(10,2);
       }
       
       
       public int multi(){
    	   return calculateService.multi(8, 6);
       }
       
       public int sub() {
    	   return calculateService.sub(5, 6);
       }
}
