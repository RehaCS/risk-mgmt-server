package com.oprisk.riskassessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class RiskL2 {
	
	@Id
	@GeneratedValue(generator="risk_generator")
	@SequenceGenerator(name="risk_generator", sequenceName="risk_sequence", initialValue=1000)
	private Long id;
	private String riskType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRiskType() {
		return riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
}
