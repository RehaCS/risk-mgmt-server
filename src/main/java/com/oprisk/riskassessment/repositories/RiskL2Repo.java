package com.oprisk.riskassessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oprisk.riskassessment.model.RiskL2;

@Repository
public interface RiskL2Repo extends JpaRepository<RiskL2,Long> {
	
}
