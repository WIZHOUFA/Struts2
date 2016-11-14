package com.struts2.helloworld;

public class Product {
	private Integer productId;
	private String productName;
	private String productDesc;
	private double productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productPrice=" + productPrice + ", productDesc=" + productDesc
				+ ", productId=" + productId + ", productName=" + productName
				+ "]";
	}
	public String save(){
		System.out.println("Result:" + this);
		return "details";
	}
}
