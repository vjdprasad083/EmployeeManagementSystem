package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Department;
import com.cg.repository.IDepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private IDepartmentRepository repo;
	
	@Override
//	@Transactional
	public void addDepartment(Department dName) {
		repo.save(dName);

	}

	@Override
	@Transactional
	public List<Department> getAllDepartment() {
		List<Department> department=repo.findAll();
		return department;
	}

	@Override
	@Transactional
	public List<Department> getAllDepartmentByPagination(String maxPage, String ofset) {
		
		return null;
	}

	@Override
	@Transactional
	public int getAllDepartmentCount() {
		int count=(int)repo.count();
		return count;
	}

	@Override
	@Transactional
	public boolean deleteDepartment(int id) {
		boolean bool;
		if(bool=repo.existsById(id)) {
		repo.deleteById(id);
		bool=true;
		}
		return bool;
	}

}
