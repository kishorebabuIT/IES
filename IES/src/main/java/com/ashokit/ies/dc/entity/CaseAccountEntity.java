package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="DC_CASES_TABLE")
public class CaseAccountEntity {
	@Id
	@GenericGenerator(name = "case_no_gen", strategy = "com.ashokit.ies.ar.generator.CaseNoGenerator")
	@GeneratedValue(generator = "case_no_gen")
	@Column(name="APP_ID")
	private String appId;
	@Column(name="CASE_NAME")
	private String caseName;
	@Column(name="DOB")
	private String dob;
	@Column(name="GENDER")
	private String gender;
	@Column(name="SSN_NO")
	private Long ssnNo;
	@Column(name="MOB_NO")
	private String mobNo;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(Long ssnNo) {
		this.ssnNo = ssnNo;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	

}
