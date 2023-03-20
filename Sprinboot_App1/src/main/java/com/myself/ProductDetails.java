package com.myself;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetails {

	List<Product> prod = null;
	
	@GetMapping(value = "/products")
	public List<Product> getList(){
		
		List<Product> prod = new ArrayList<Product>();
		
		prod.add(new Product(1, "abc1", 100, "xyz1", "mno1", 01, 101));
		prod.add(new Product(2, "abc2", 150, "xyz2", "mno2", 02, 102));
		prod.add(new Product(3, "abc3", 200, "xyz3", "mno3", 03, 103));
		prod.add(new Product(4, "abc4", 250, "xyz4", "mno4", 04, 104));
		prod.add(new Product(5, "abc5", 300, "xyz5", "mno5", 05, 105));
		
		return prod;
	}
	
	@GetMapping(value = "/product/{id}")
	public Product getProduct(@PathVariable ("id") Integer id) {
		
		Product prod = new Product();
		
		prod.setId(id);
		prod.setName("Adi");
		prod.setPrice(100);
		prod.setBrand("Nike");
		prod.setCategory("Shoes");
		prod.setRegistration_number(101);
		prod.setManufacturer_id(1001);
		
		System.out.println("Complete getProduct Method");
		return prod;
		
	}
	
	
	@PostMapping(value = "/product")
	public String saveProduct(@RequestBody Product prod) {
		
		return "Product" + prod.toString() + "Saved";
		
//		{
//		    "id":1,
//		    "name":"HRK",
//		    "price":1200,
//		    "brand":"ZARA",
//		    "category":"Clothes",
//		    "registration_number":101,
//		    "manufacturer_id":1001
//		}
	}
	
	@PutMapping(value = "/updatePrice/{price}")
	public Product updateProd(@RequestBody Product prod , @PathVariable("price") Integer pri) {
		
		prod.setPrice(pri);
		
		return prod;
	}
	
	
	@DeleteMapping(value = "/product/{id}")
	public String deleteProduct(@PathVariable ("id") Integer id) {
		
		for(Product x : prod) {
			if(x.getId() == id) {
				prod.remove(x);
			}
		}
		
		return "Product" + "Deleted";
		
//		{
//		    "id":1,
//		    "name":"HRK",
//		    "price":1200,
//		    "brand":"ZARA",
//		    "category":"Clothes",
//		    "registration_number":101,
//		    "manufacturer_id":1001
//		}
	}

	
}
