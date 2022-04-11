package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Compliance;
import com.cg.entities.StatusReport;
import com.cg.repository.IComplianceRepository;

public class ComplianceServiceImpl implements ComplianceService {

	@Autowired
	private IComplianceRepository repo;
	
	@Override
	@Transactional
	public void createRL(Compliance co) {
		repo.save(co);

	}

	@Override
	@Transactional
	public List<Compliance> getAllRL() {
		List<Compliance> compliance=repo.findAll();
		return compliance;
	}

	@Override
	@Transactional
	public List<Compliance> getAllRL(int userId) {
	
		return null;
	}

	@Override
	@Transactional
	public void createStatusReport(StatusReport statusReport) {

	}

	@Override
	@Transactional
	public List<StatusReport> getAllStatusReport(String userId, int compId) {
		// TODO Auto-generated method stub
		return null;
	}

}
