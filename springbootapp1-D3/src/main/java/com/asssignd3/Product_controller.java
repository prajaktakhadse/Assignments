package com.asssignd3;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product_controller {
  
	
	@RequestMapping("/")
    public List<Product_bean>getAllProducts() {
	    return getAllProducts();
     }
    
    @RequestMapping(value="/addproduct",method = RequestMethod.POST)
    public void addproduct(@RequestBody Product_bean product_bean){
    	return;
    }

	
}
