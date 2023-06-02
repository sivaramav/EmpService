package com.atmecs.employeeapp.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.employeeapp.entity.Employee;
import com.atmecs.employeeapp.repository.EmployeeRepository;
import com.atmecs.employeeapp.responce.EmployeeResponce;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public EmployeeResponce saveEmployee(Employee employee) {
		
		Employee emp=employeeRepo.save(employee);
		EmployeeResponce empRes= mapper.map(emp, EmployeeResponce.class);
		
		// TODO Auto-generated method stub
		return empRes;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
				
		return (List<Employee>) employeeRepo.findAll();
	}
	

	@Override
	public Employee updateEmployee(Employee employee, Long employeeId) {
		// TODO Auto-generated method stub
		Employee empDb = employeeRepo.findById(employeeId).get();
		
	      if(employee.getEmployeeName() != null) {
	    	  empDb.setEmployeeName(employee.getEmployeeName());
	      }
	      if(employee.getEmployeeEmail()!= null) {
	    	  empDb.setEmployeeEmail(employee.getEmployeeEmail());
	      }
	      
	     
		return  employeeRepo.save(empDb);
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		
		employeeRepo.deleteById(employeeId);
	}

	@Override
	public EmployeeResponce getEmployeeById(Long id) {
		
	Employee emp = employeeRepo.findById(id).get();
		
		EmployeeResponce empRes= mapper.map(emp, EmployeeResponce.class);

	
		return  empRes;
	}

}
