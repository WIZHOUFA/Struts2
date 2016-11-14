package com.struts.model;

public class Address {
	private String province;
	private String city;
	private String qu;
	public Address() {
		super();
	}
	public Address(String province, String city, String qu) {
		super();
		this.province = province;
		this.city = city;
		this.qu = qu;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", province=" + province + ", qu="
				+ qu + "]";
	}
     
}
