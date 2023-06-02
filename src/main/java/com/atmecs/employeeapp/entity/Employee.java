package com.atmecs.employeeapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String employeeName;
	private String employeeEmail;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "projectId") private Integer projectId;
	 */
}
