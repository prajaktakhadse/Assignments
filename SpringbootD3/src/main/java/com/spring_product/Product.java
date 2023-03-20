//Assignment Day-3
//Q. Perform crud on the following table
//Product will contain this information :
//id :
//name:
//price:
//brand: ,
//category: ,
//registration_number:
//manufacturer_id:
//● Product :
//○ Get All Products information
//■ To get a list of products call the following endpoint with GET Request
//■ Endpoint: http://localhost:8080/products
//○ Get the information of any particular product by id
//■ To get a particular product, use the following URL with GET request
//type in postman
//■ Endpoint : http://localhost:8080/product/<id>
//○ Create a new Product
//■ To Create New Product use the following URL with POST Request
//■ Endpoint: http://localhost:8080/product
//(OPTIONAL)
//○ Delete Product
//■ To delete a particular Product from the database, use the following
//URL with DELETE Request
//■ Endpoint: http://localhost:8080/product/<id>
//○ Update Product
//■ To update Product in the database, use the following URL with PUT
//request type in postman
//■ Endpoint : http://localhost:8080/product/<id>
//configure Data Access Layer with JPA Hibernate. that was taught in unit-4.


/*step1:--*/
package com.spring_product;


	public class Product{
		
	      private Integer id ;
	      private String name;
	      private Integer price;
	      private String brand;
	      private String category;
	      private Integer registeration_number;
	      private Integer manufacturer_id;
	      
	      
	      public Product(){
			// TODO Auto-generated constructor stub
		}


		public Product(Integer id, String name, Integer price, String brand, String category,
				Integer registeration_number, Integer manufacturer_id) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.brand = brand;
			this.category = category;
			this.registeration_number = registeration_number;
			this.manufacturer_id = manufacturer_id;
		}


		


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getPrice() {
			return price;
		}


		public void setPrice(Integer price) {
			this.price = price;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public Integer getRegisteration_number() {
			return registeration_number;
		}


		public void setRegisteration_number(Integer registeration_number) {
			this.registeration_number = registeration_number;
		}


		public Integer getManufacturer_id() {
			return manufacturer_id;
		}


		public void setManufacturer_id(Integer manufacturer_id) {
			this.manufacturer_id = manufacturer_id;
		}


		@Override
		public String toString() {
			return "Product_bean [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
					+ category + ", registeration_number=" + registeration_number + ", manufacturer_id=" + manufacturer_id
					+ "]";
		}
		
		
	}


