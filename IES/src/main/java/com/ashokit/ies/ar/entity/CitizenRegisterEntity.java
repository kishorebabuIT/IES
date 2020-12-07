package com.ashokit.ies.ar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CITIZEN_DETAILS")
public class CitizenRegisterEntity {
	
	@Id
	@GenericGenerator(name = "citizen_no_gen", strategy = "com.ashokit.ies.ar.generator.CitizenIdGenerator")
	@GeneratedValue(generator = "citizen_no_gen")
	@Column(name = "APP_NUMBER")
	private String appNo;
	
	@Column(name = "FIRST_NAME")
	private String firstName; 
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "DOB")
	private String dob;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "SSNNO")
	private Long ssnNo;
	
	@Column(name = "MOBILENO")
	private String mobNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name="ACC_STATUS")
	private String accStatus;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAppNo() {
		return appNo;
	}
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	
	
	

}
