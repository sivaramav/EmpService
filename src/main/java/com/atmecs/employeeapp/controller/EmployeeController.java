package com.atmecs.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.employeeapp.entity.Employee;
import com.atmecs.employeeapp.responce.EmployeeResponce;
import com.atmecs.employeeapp.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", empservice.getEmployeeList());
        
        return "index";
    }
	@GetMapping("/addnew")
    public String addNewEmployee(Model model) {
		//EmployeeResponce employee = new EmployeeResponce();
        model.addAttribute("employee", new EmployeeResponce());
        return "newemployee";
    }
	
	@PostMapping("/employee")
	public ResponseEntity<Object>   saveEmployee(@RequestBody Employee emp){
		
		EmployeeResponce empObj 	= empservice.saveEmployee(emp);
		
	     return new ResponseEntity<Object>(empObj,HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
	public String  save(@ModelAttribute("employee") Employee employee){
		
		empservice.saveEmployee(employee);
		
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
		EmployeeResponce empObj = empservice.getEmployeeById(id);
        model.addAttribute("employee", empObj);
        return "update";
    }
	
	@GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
		 empservice.deleteEmployeeById(id);
        return "redirect:/";
 
    }
 
	
	
	
	@PutMapping("/employee/{employeeId}")
	public ResponseEntity<Object>  updateEmployee(@RequestBody Employee emp,@PathVariable("employeeId") Long id){
		
		emp.setEmployeeId(id);
		EmployeeResponce empObj 	= empservice.saveEmployee(emp);
		
		return new ResponseEntity<Object>(empObj,HttpStatus.OK);
	}
	
	@GetMapping("employee/{employeeId}")
	public ResponseEntity<Object> getEmployee(@PathVariable("employeeId") Long id){
		
		EmployeeResponce empObj 	= empservice.getEmployeeById(id);
		
		 return new ResponseEntity<Object>(empObj,HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Object> getEmployeeList(){
		
		 List<Employee> empList 	= empservice.getEmployeeList();
		
		 return new ResponseEntity<Object>(empList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<Object> deleteEmployeById(@PathVariable("employeeId") Long id){
		
		 empservice.deleteEmployeeById(id);
	
		 return new ResponseEntity<Object>("employeeDeleted",HttpStatus.OK);
	}
	
	
	 
	
	
	
	

}
