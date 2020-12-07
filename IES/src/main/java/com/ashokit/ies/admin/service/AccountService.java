package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.model.AppPlan;

public interface AccountService {
	
	public boolean saveAccount(AppAccount acc);
	
	public List<AppAccount> getAllAccounts(); 
	
	public AppAccount editAccount(Integer accId);
	
	public boolean deleteAccount(Integer accId);
	
	
	public boolean createPlan(AppPlan plan);
	
	public List<AppPlan> getAllPlans();
	
	public AppPlan  editPlan(Integer palnId);
	
	public boolean deletePlan();
	
	
	
	

}
