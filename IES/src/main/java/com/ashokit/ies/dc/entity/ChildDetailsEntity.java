package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHILD_DETAILS")
public class ChildDetailsEntity {
	@Id
	@Column(name="CASE_ID")
	private String caseId;
	@Column(name="NAME")
	private String name;
	@Column(name="CHILD_NAME")
	private String childName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="CHILD_DOB")
	private String childDob;
	@Column(name="CHILD_SSNNO")
	private String childSsnNo;
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getChildDob() {
		return childDob;
	}
	public void setChildDob(String childDob) {
		this.childDob = childDob;
	}
	public String getChildSsnNo() {
		return childSsnNo;
	}
	public void setChildSsnNo(String childSsnNo) {
		this.childSsnNo = childSsnNo;
	}

}
