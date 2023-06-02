package com.atmecs.employeeapp;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.atmecs.employeeapp.entity.Employee;
import com.atmecs.employeeapp.services.EmployeeService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class EmployeeControllerTest {
	
	@MockBean
	EmployeeService empservice;
	
	 @Autowired
	    private MockMvc mockMvc;
	
	
	    @Test
	    public void testGetExample() throws Exception {
	        List<Employee> emplist = new ArrayList<>();
	        Employee emp = new Employee();
	        emp.setEmployeeId(1l);
	        emp.setEmployeeName("siva");
	        emp.setEmployeeEmail("siva@gmail.com");
	        emplist.add(emp);
	        
	        Mockito.when(empservice.getEmployeeList()).thenReturn(emplist);
	        mockMvc.perform(get("/employee")).andExpect(status().isOk()).
	        andExpect(jsonPath("$", Matchers.hasSize(1)))
	                .andExpect(jsonPath("$[0].employeeName", Matchers.equalTo("siva")));
	    }

}
