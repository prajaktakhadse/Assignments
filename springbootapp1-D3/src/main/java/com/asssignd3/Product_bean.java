package com.asssignd3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product_bean {
	@Id
      private Integer id ;
      private String name;
      private Integer price;
      private String brand;
      private String category;
      private Integer registeration_number;
      private Integer manufacturer_id;
      
      
      public Product_bean() {
		// TODO Auto-generated constructor stub
	}


	public Product_bean(Integer id, String name, Integer price, String brand, String category,
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
