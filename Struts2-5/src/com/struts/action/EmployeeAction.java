package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.model.Employee;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8632715925909816689L;
	private Employee employee;
	public Employee getModel() {
		// TODO Auto-generated method stub
		employee=new Employee();
		return employee;
	}
    public String execute(){
    	System.out.println(employee);
    	return "success";
    }
}
