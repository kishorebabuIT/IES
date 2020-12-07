package com.ashokit.ies.dc.service;

import com.ashokit.ies.dc.model.CaseAccount;
import com.ashokit.ies.dc.model.ChildDetails;
import com.ashokit.ies.dc.model.CitizenPlan;

public interface CaseService {
	
	public CaseAccount getCaseById(String appNo);
	
	public boolean saveCaseAccount(CaseAccount account);
	
	//public boolean saveCitizenPlan(CitizenPlan plan);

	public boolean saveCitizenPlan(CitizenPlan plan);
	
	//public boolean saveChildDetails(ChildDetails child);

	public boolean saveChildDetails(ChildDetails child);

}
