package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CITIZEN_PLAN_DETAILS")
public class CitizenPlanEntity {
	@Id
	@Column(name="CASE_ID")
	private String caseId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="SELECT_PLAN")
	private String slectPlan;
	
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSlectPlan() {
		return slectPlan;
	}
	public void setSlectPlan(String slectPlan) {
		this.slectPlan = slectPlan;
	}
	

}
