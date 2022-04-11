package com.cg.services;

import java.util.List;

import com.cg.entities.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int userId);
	public List<Employee> getAllEmployeeByPagination( String maxPage,String ofSet);
	public int getEmployeeCount();
	
	

}
