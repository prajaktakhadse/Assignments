package com.revision5.q2;

import java.util.Objects;

public class Product {
    private String name;
    private double price ;
    private int count ;
    private String company ;
	
    
    public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(String name, double price, String company ,int count ) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		this.company = company;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}

   
	
	@Override
	public int hashCode() {
		return Objects.hash(company, count, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(company, other.company) && count == other.count && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", count=" + count + ", company=" + company + "]";
	}
    
    
}
