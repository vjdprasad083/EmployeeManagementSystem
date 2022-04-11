package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Employee;
import com.cg.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
//	@Transactional
	public Employee addEmployee(Employee emp) {
		Employee employee=repo.save(emp);
		return employee;
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		repo.deleteById(id);

	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee emp) {
		Employee employee=repo.save(emp);
		return employee;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		List<Employee> employee=repo.findAll();
		return employee;
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int userId) {
		Employee employee=repo.getById(userId);
		return employee;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployeeByPagination(String maxPage, String ofSet) {
//		List<Employee> employee=repo.
		return null;
	}

	@Override
	@Transactional
	public int getEmployeeCount() {
		int count=(int)repo.count();
		return count;
	}

}
