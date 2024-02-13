package com.service;

import java.util.List;

import com.model.Employee;


public interface EmployeeServiceInt {

	
	//Employee
	Employee addEmployee(Employee employee);
	Employee getOneEmployee(int id);
	List<Employee> getAllemployee();
	Employee updateEmployee(Employee employee);
	void deleteEmployee(int id);
}
