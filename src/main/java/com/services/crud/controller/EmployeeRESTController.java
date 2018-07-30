package com.services.crud.controller;


import java.util.List; 

import com.services.crud.dao.EmployeeDAO;
import com.services.crud.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRESTController {

	//@Autowired
	private EmployeeDAO empDao; 
	
	
	
	public EmployeeRESTController() {
		super();
		this.empDao = new EmployeeDAO();
	}

	@RequestMapping("/")
	@ResponseBody
	public String Welcome() {
		return "Welcome to REST Template Example"; 
	}
	
	//GET : /employees
	@RequestMapping(value="/employee", 
			method=RequestMethod.GET,
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
			)
	@ResponseBody
	public List<Employee> getEmployees(){
		List<Employee> empList = empDao.getAllEmployees();
		return empList;
	}
	
	//GET : /employees/1001
	@RequestMapping(value="/employee/{empNo}", 
			method=RequestMethod.GET, 
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public Employee getEmployee(@PathVariable("empNo") String empNo) {
		Employee emp = empDao.getEmployee(empNo);
		return emp; 
	}
	
	//POST: /employees
	@RequestMapping(value="/employee", 
			method=RequestMethod.POST,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public Employee createEmployee(@RequestBody Employee item) {
		System.out.println("Creating Employee, " + item.getEmpNo());
		return empDao.addEmployee(item);
	}
	
	//PUT: /employees
	@RequestMapping(value="/employee", 
			method=RequestMethod.PUT,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public Employee updateEmployee(@RequestBody Employee item) {
		System.out.println("Updating Employee, " + item.getEmpNo());
		return empDao.updateEmployee(item);
	}
	
	//DELETE: /employees/{empNo}
	@RequestMapping(value="/employee", 
			method=RequestMethod.DELETE,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public void deleteEmployee(@PathVariable String empNo) {
		System.out.println("Deleting Employee, " + empNo);
		empDao.deleteEmployee(empNo);
	}
}
