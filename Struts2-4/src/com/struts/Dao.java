package com.struts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	private static Map<Integer,Employee> map;
	static{
		map=new LinkedHashMap<Integer,Employee>();
		map.put(1001,new Employee(1001,"Smith","Dannale"));
		map.put(1002,new Employee(1002,"Browen","Lily"));
		map.put(1003,new Employee(1003,"Steven","Jobs"));
		map.put(1004,new Employee(1004,"Eirfu","Tom"));
		map.put(1005,new Employee(1005,"Thlir","Joe"));
		map.put(1006,new Employee(1006,"Malulian","Menlu"));
	}
	public List<Employee> list(){
		return new ArrayList<Employee>(map.values());
	}
	public void save(Employee employee){
		long id=System.currentTimeMillis();
		employee.setEmployeeID((int)id);
		map.put((int)id, employee);
	}
	public void delete(Integer employeeID){
		map.remove(employeeID);
	}
	public Employee get(Integer employeeID){
		return map.get(employeeID);
	}
	public void update(Integer employeeID,Employee employee){
		map.put(employeeID,employee);
	}
}
