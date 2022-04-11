package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entities.Compliance;
import com.cg.entities.StatusReport;
import com.cg.services.ComplianceService;



@RestController
@RequestMapping("/api")
public class ComplianceController {
	@Autowired
	ComplianceService Repo;
	@RequestMapping("/createRL")
	void createRL(@RequestBody Compliance co) {
		Repo.createRL(co);
	}
	@RequestMapping("/createStatusReport")
	void createStatusReport(@RequestBody StatusReport statusreport) {
		Repo.createStatusReport(statusreport);
	}
	
	@GetMapping("/getAllRL")
	public List<Compliance> getAll() {
		List<Compliance> Compliance = Repo.getAllRL();
		return Compliance;
		
	}
	@GetMapping("/getAllRL")
	public List<Compliance> getAllRl(@RequestBody int userId){
		List<Compliance> compiance = Repo.getAllRL(userId);
		return compiance;
		
	}
	@GetMapping("/getAllStatusReport")
	public List<StatusReport> getAllStatusReport(@RequestBody String userId,int compId) {
		List<StatusReport> compliances = Repo.getAllStatusReport(userId, compId);
		return compliances;
	}
		
	

}