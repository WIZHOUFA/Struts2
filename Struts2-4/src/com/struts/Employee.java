package com.struts;

public class Employee {
	private Integer employeeID;
	private String firstName;
	private String lastName;
	public Employee() {
		super();
	}
	public Employee(Integer employeeID, String firstName, String lastName) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
}
