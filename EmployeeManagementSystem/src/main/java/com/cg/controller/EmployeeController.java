package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Employee;
import com.cg.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService Repo;
	@RequestMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee employee = Repo.addEmployee(emp);
		return employee;
	}
	@RequestMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam int id) {
		
		Repo.deleteEmployee(id);
//		System.out.println("the employee with id"+" "+id +" is deleted");
	}
	@RequestMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		Employee employee=Repo.updateEmployee(emp);
		return employee;
	}
	@GetMapping("/getEmployeeByuserId")
	public Employee getEmployeeByuserId(@RequestParam int userId) {
	Employee employee = Repo.getEmployeeById(userId);
	return employee;
	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		List<Employee> employee = Repo.getAllEmployees();
		return employee;
	}

}