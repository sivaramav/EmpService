package com.atmecs.employeeapp.responce;

import com.atmecs.employeeapp.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponce {
	
	private Long employeeId;
	private String employeeName;
	private String employeeEmail;

}
