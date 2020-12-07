package com.ashokit.ies.ed.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityEntity {

	@Id
	@Column(name = "ED_TRACE_ID")
	private Integer edTraceId;

	@Column(name = "BENEFIT_AMT")
	private String benefifitAmt;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "CREATE_DT")
	private Date createDt;

	@Column(name = "DENIAL_REASON")
	private String denialReason;

	@Column(name = "PLAN_END_DT")
	private String planEndDate;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "PLAN_START_DT")
	private String planStartDate;

	@Column(name = "PLAN_STATUS")
	private String planStatus;

	@Column(name = "UPDATE_DT")
	private Date updateDt;

	public Integer getEdTraceId() {
		return edTraceId;
	}

	public void setEdTraceId(Integer edTraceId) {
		this.edTraceId = edTraceId;
	}

	public String getBenefifitAmt() {
		return benefifitAmt;
	}

	public void setBenefifitAmt(String benefifitAmt) {
		this.benefifitAmt = benefifitAmt;
	}

	public Integer getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

}
