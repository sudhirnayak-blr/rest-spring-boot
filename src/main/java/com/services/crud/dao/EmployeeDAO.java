package com.services.crud.dao;

import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.List; 

import com.services.crud.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	
	static {
		initEmps(); 
	}
	private static void initEmps() {
		Employee emp1 = new Employee("1001", "Employee 1 Name", "Project Manager");
		Employee emp2 = new Employee("1002", "Employee 1 Name", "Delivery Manager");
		Employee emp3 = new Employee("1003", "Employee 1 Name", "Business Manager");
		
		empMap.put(emp1.getEmpNo(), emp1);
		empMap.put(emp2.getEmpNo(), emp2);
		empMap.put(emp3.getEmpNo(), emp3);
		
	}
	
	public Employee getEmployee(String empNo) {
		return empMap.get(empNo);
	}
	public Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	public Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	public void deleteEmployee(String empNo) {
		empMap.remove(empNo);
		
	}
	public List<Employee> getAllEmployees(){
		Collection<Employee> c = empMap.values(); 
		List<Employee> list = new ArrayList<Employee>(); 
		list.addAll(c);
		return list; 
	}
	
}
