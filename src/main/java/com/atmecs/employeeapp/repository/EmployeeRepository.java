package com.atmecs.employeeapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atmecs.employeeapp.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
	
	

}
