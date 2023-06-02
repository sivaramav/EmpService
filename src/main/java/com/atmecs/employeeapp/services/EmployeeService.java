package com.atmecs.employeeapp.services;

import java.util.List;

import com.atmecs.employeeapp.entity.Employee;
import com.atmecs.employeeapp.responce.EmployeeResponce;

public interface EmployeeService {

	EmployeeResponce saveEmployee(Employee employee);

	// Read operation
	List<Employee> getEmployeeList();

	// Update operation
	Employee updateEmployee(Employee employee, Long employeeId);

	// Delete operation
	void deleteEmployeeById(Long employeeId);
	
	EmployeeResponce getEmployeeById(Long id);

}
