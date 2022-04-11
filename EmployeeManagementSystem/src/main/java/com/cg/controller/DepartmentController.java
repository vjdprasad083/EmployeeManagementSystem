package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Department;
import com.cg.services.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	@Autowired
	DepartmentService Repo;
	@RequestMapping("/addDepartment")
	public void addDepartment(@RequestBody Department DepartName) {
		 Repo.addDepartment(DepartName);
	}
	@GetMapping("/getAllDepartment)")
	List<Department> getAllDepartment() {
		List<Department> department = Repo.getAllDepartment();
		return department;
	}
	@GetMapping("/getAllDepartCount")
	public List<Department> getAllDepartCount() {
		List<Department> department = Repo.getAllDepartment();
		return department;
	}
	@RequestMapping("/deleteDepartment")
	public boolean deleteDepartment (int departId) {
		boolean department = Repo.deleteDepartment(departId);
		return department;
	}
}