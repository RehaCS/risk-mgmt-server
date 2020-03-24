package com.oprisk.riskassessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class RiskL3 {
	
	@Id
	@GeneratedValue(generator="risk_generator_l3")
	@SequenceGenerator(name="risk_generator_l3", sequenceName="risk_sequence_l3", initialValue=1000)
	private Long id;
	private String riskType;
	@ManyToOne
	private RiskL2 riskL2;
	
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
	public RiskL2 getRiskL2() {
		return riskL2;
	}
	public void setRiskL2(RiskL2 riskL2) {
		this.riskL2 = riskL2;
	}
}