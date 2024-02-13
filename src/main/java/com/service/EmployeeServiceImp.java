package com.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.dao.EmployeeRepository;
import com.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeServiceInt{

	
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	
	

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getOneEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getAllemployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Employee emp = employeeRepo.findById(employee.getId()).orElse(null);
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmail(employee.getEmail());
		return employeeRepo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {

		employeeRepo.deleteById(id);
	}

}
