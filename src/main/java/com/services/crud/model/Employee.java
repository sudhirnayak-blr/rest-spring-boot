package com.services.crud.model;

public class Employee {

	private String empNo;
	private String empName;
	private String designation;

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(String empNo, String empName, String designation) {
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
	}

	public Employee() {
		
	}

}
