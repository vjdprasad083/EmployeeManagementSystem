package com.cg.services;

import java.util.List;

import com.cg.entities.Compliance;
import com.cg.entities.StatusReport;

public interface ComplianceService {
	public void createRL(Compliance co);
	public List<Compliance> getAllRL();
	public List<Compliance> getAllRL(int userId);
	public void createStatusReport(StatusReport statusReport);
	public List<StatusReport> getAllStatusReport(String userId,int compId);

}
