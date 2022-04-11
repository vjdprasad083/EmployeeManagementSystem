package com.cg.services;

import java.util.List;

import com.cg.entities.Department;

	public interface DepartmentService {
	public void addDepartment(Department departName);
	public List<Department> getAllDepartment();
	public List<Department> getAllDepartmentByPagination(String maxPage,String ofset);
	public int getAllDepartmentCount();
	public boolean deleteDepartment(int id);
}
