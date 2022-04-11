 package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
