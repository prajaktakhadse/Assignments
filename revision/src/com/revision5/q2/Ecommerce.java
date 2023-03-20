package com.revision5.q2;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
   List<Product>  productList = new ArrayList<>();
   
   public void addProductToList(Product product) {
	   if(productList.contains(product)) {
		   for(Product prod:productList) {
			   if(prod.getName().equals(product.getName()) && prod.getPrice()== product.getPrice() && prod.getCompany().equals(product.getCompany())) {
				   prod.setCount(prod.getCount()+ product.getCount());
				   System.out.println("Count updated Product already exists");
			   }
		   }
	   }
	   else {
		   productList.add(product);
		   System.out.println("Product added successfully");
	   }
   }
   
   public  List<Product> showAllProduct(){
	   return productList;
   }
   
   public static void main(String[] args) {
	   Ecommerce ecommerce=new Ecommerce();
	   ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
	   ecommerce.addProductToList(new Product("Ipad",100000,"Apple",2));
	   ecommerce.addProductToList(new Product("Ipad",100000,"Apple",4));
	   ecommerce.addProductToList(new Product("Shoes",4000,"Nike",4));
	   ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
	  
	  
	   
	   for(Product p:ecommerce.showAllProduct()) {
		   System.out.println(p);
	   }
  }
}
