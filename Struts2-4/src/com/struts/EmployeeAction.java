package com.struts;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction implements RequestAware,ModelDriven<Employee>,Preparable{
    private Map<String,Object> request;
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request=arg0;
	}
	private Dao dao=new Dao();
	public String list(){
		request.put("list",dao.list());
		return "list";
	}
	public String delete(){
		dao.delete(employeeID);
		return "success";
	}
    private Employee employee;
    
    public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String save(){
    	dao.save(employee);
    	return "success";
    }
	public void prepareSave(){
		employee=new Employee();
	}
	private Integer employeeID;
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String update(){
		dao.update(employee.getEmployeeID(),employee);
		return "success";
	}
	public void prepareUpdate(){
		employee=dao.get(employeeID);
	}
	public String edit(){
		return "edit";
	}
	public void prepareEdit(){
		employee=dao.get(employeeID);
	}
	public Employee getModel() {
		return employee;
	}
	//�ڈ��Єh���ĕr��getModel����������ݿ��м��ض��󣨲�Ӧ�ü��أ�;
	//��list���ݿ�����ʱû�б�Ҫnew Employee();
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Prepare...");
	}
}
