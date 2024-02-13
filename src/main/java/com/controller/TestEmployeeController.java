package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("employee")

public class TestEmployeeController {

	@Autowired
	EmployeeServiceImp employeeservice;

	
	//Employee
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeservice.addEmployee(employee);
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee findEmployee(@PathVariable int id)
	{
		return employeeservice.getOneEmployee(id);
		
	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllemployee()
	{
		return employeeservice.getAllemployee();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeservice.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeservice.deleteEmployee(id);
	}
	
	
}
