package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Compliance;
import com.cg.entities.StatusReport;


@Repository
public interface IComplianceRepository extends JpaRepository<Compliance, Integer>{


}
