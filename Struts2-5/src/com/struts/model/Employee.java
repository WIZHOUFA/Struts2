package com.struts.model;

import java.util.Date;

public class Employee {
	private String empName;
	private Integer age;
	private Address address;
	private Date birth;
	public Employee() {
		super();
	}
	public Employee(String empName, Integer age, Address address, Date birth) {
		super();
		this.empName = empName;
		this.age = age;
		this.address = address;
		this.birth = birth;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", age=" + age + ", birth="
				+ birth + ", empName=" + empName + "]";
	}
	
}
