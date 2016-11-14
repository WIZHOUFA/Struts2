package com.struts.helloworld;

public class Product {
	private String name;
	private Integer price;
	private String brand;
	
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
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", brand="
				+ brand + "]";
	}
	
	public String save(){
		System.out.println("Result"+this);
		return "details";
	}
}
