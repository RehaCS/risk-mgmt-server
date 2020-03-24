package com.oprisk.riskassessment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oprisk.riskassessment.model.RiskL2;
import com.oprisk.riskassessment.repositories.RiskL2Repo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RiskL2Controller {
	// https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo
	// { "riskType": "riskone"}
	@Autowired
	private RiskL2Repo riskL2Repo;
	
	
	@GetMapping("/level2risk")
	public List<RiskL2> getL2Risk(){
		return this.riskL2Repo.findAll();
	}

	@PostMapping("/level2risk")
	public RiskL2 postl2Risk(@Valid @RequestBody RiskL2 riskL2) {
		return this.riskL2Repo.save(riskL2);
	}
	
	
}
