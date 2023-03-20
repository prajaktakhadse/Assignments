package com.spring_product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*step3:--*/
@RestController
 public class ProductController {
	
	//○ Get All Products information
	//■ To get a list of products call the following endpoint with GET Request
	//■ End point: http://localhost:8080/products
    @GetMapping("/productDetails")
    public List<Product> getAllProd(){
    	 
    	List<Product> list = new ArrayList<>();
    	
    	try(Connection conn = ProductUtil.provideConnection()){
    		
    		
    		PreparedStatement ps = conn.prepareStatement("Select * from product");
    		
    		ResultSet x = ps.executeQuery();
    		
    		Product em = new Product();
    		
    		while(x.next()){
    			em.setId(x.getInt(1));
    			em.setName(x.getString(2));
    			em.setPrice(x.getInt(3));
    			em.setBrand(x.getString(4));
    			em.setCategory(x.getString(5));
    			em.setRegisteration_number(x.getInt(6));
    			em.setManufacturer_id(x.getInt(7));
    			list.add(em);
    		}
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
    	
    	return list;
    }
    
      //○ Create a new Product
	  //■ To Create New Product use the following URL with POST Request
	  //■ End point: http://localhost:8080/product
	  //(OPTIONAL)
    
      @PostMapping("/product")
      public String insertProduct(@RequestBody Product p ){
    	  
    	  Connection conn = ProductUtil.provideConnection();
    	  if(conn!=null)
    		  System.out.println("Connection established");
    	  else
    		  System.out.println("Not established");
    			  
    	  String s =  "Not inserted ";
    	  
    	  try(Connection conn1 = ProductUtil.provideConnection()){
    		  PreparedStatement ps = conn1.prepareStatement("insert into product values(?,?,?,?,?,?,?) ");
    		  
    		  
    		ps.setInt(1, p.getId());
    		
    		  
    		  
    	  }catch(Exception exp) {
    		  
    	  }
		return s;
      }
    
    

    
    
    

		//○ Get the information of any particular product by id
		//■ To get a particular product, use the following URL with GET request
		//type in postman
		//■ End point : http://localhost:8080/product/<id>

        @GetMapping
        public Product getProductById(@PathVariable("id") int eid) {
        	  Product em  =  new Product();
        	  
        	  try(Connection conn =  ProductUtil.provideConnection()){
        		  PreparedStatement ps  = conn.prepareStatement("Select * from product WHERE eid =? ");
        		  
        		  ps.setInt(1, eid);
        		  
        		  ResultSet x = ps.executeQuery();
        		  
        		  if(x.next()){
          			em.setId(x.getInt(1));
          			em.setName(x.getString(2));
          			em.setPrice(x.getInt(3));
          			em.setBrand(x.getString(4));
          			em.setCategory(x.getString(5));
          			em.setRegisteration_number(x.getInt(6));
          			em.setManufacturer_id(x.getInt(7));
          			
          		}else 
          			em =  null;
          		
        	  }catch(SQLException e) {
        		  System.out.println(e.getMessage());
        	  }
        	  
        	  return em;
        }
   
}
























