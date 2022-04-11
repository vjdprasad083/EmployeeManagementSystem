package com.cg.entities;




import java.time.LocalDate;
import java.util.List;
//import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(
		name = "Department",
		uniqueConstraints = @UniqueConstraint(columnNames = "departName")
		)

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departId;
	private String departName;

	@OneToMany(
			mappedBy="department", 
			cascade= CascadeType.ALL
			
			
			
			)
	private List<Employee> employee;
	@OneToMany(
			mappedBy="department", 
			cascade=CascadeType.ALL
			
			)
	private List<Compliance> compliance;
	
//	@OneToMany(
//			mappedBy="Employee.department", 
//			cascade=CascadeType.ALL
//			
//			)
//	private List<StatusReport> statusReport;
	
	
}