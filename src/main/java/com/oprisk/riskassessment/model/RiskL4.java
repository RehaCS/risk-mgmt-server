package com.oprisk.riskassessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class RiskL4 {
	
	@Id
	@GeneratedValue(generator="risk_generator_l4")
	@SequenceGenerator(name="risk_generator_l4", sequenceName="risk_sequence_l4", initialValue=1000)
	private Long id;
	private String riskType;
	@ManyToOne
	private RiskL3 riskL3;
	
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
	public RiskL3 getRiskL3() {
		return riskL3;
	}
	public void setRiskL3(RiskL3 riskL3) {
		this.riskL3 = riskL3;
	}
}