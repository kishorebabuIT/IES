package com.ashokit.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CO_PDFS")
public class CoPdfEntity {
	
	@Column(name="CO_PDF_ID")
	private Integer coPdfId;
	
	@Column(name="PLAN_STATUS")
	private  String planStatus;
	
	@Column(name="CASE_NUM")
	private String caseNum;
	
	@Column(name="PDF_DOC")
	private Blob pdfDoc;
	
	@Column(name="PLAN_NAME")
	private String planName;

	public Integer getCoPdfId() {
		return coPdfId;
	}

	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public Blob getPdfDoc() {
		return pdfDoc;
	}

	public void setPdfDoc(Blob pdfDoc) {
		this.pdfDoc = pdfDoc;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	

}
