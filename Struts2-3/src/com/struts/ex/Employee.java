package com.struts.ex;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Employee {
	private String name;
	private String password;
	private String gender;
	private String desc;
	private String departmentName;
	private List<String> roleName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<String> getRoleName() {
		return roleName;
	}
	public void setRoleName(List<String> roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "Employee [departmentName=" + departmentName + ", desc=" + desc
				+ ", gender=" + gender + ", name=" + name + ", password="
				+ password + ", roleName=" + roleName + "]";
	}
	public String input(){
		Map<String,Object> request=(Map<String,Object>)ActionContext.getContext().get("request");
		DAO dao=new DAO();
		List<Department> department=dao.getDepartments();
		List<Role> role=dao.getRoles();
		request.put("department", department);
		request.put("role", role);
		return "input";
	}
	public String details(){
		return "details";
	}
}
