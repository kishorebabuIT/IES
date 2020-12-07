package com.ashokit.ies.dc.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.ar.entity.CitizenRegisterEntity;
import com.ashokit.ies.ar.repository.CitizenRepository;
import com.ashokit.ies.dc.entity.CaseAccountEntity;
import com.ashokit.ies.dc.entity.ChildDetailsEntity;
import com.ashokit.ies.dc.entity.CitizenPlanEntity;
import com.ashokit.ies.dc.model.CaseAccount;
import com.ashokit.ies.dc.model.ChildDetails;
import com.ashokit.ies.dc.model.CitizenPlan;
import com.ashokit.ies.dc.repository.CaseRepository;
import com.ashokit.ies.dc.repository.ChildDetailsRepository;
import com.ashokit.ies.dc.repository.CitizenPlanRepository;

@Service
public class CaseServiceImpl implements CaseService {
	
	@Autowired
	private CitizenRepository repo;
	
	@Autowired
	private CaseRepository repository;
	
	@Autowired
	private CitizenPlanRepository planRepo;
	
	@Autowired
	private ChildDetailsRepository childRepo;

	public CaseAccount getCaseById(String appNo) {

		Optional<CitizenRegisterEntity> findById = repo.findById(appNo);
		if (findById.isPresent()) {
			CitizenRegisterEntity entity = findById.get();

			CaseAccount account = new CaseAccount();
			BeanUtils.copyProperties(entity, account);
			return account;
		}
		return null;

	}

	@Override
	public boolean saveCaseAccount(CaseAccount account) {

		CaseAccountEntity entity = new CaseAccountEntity();
		BeanUtils.copyProperties(account, entity);

		CaseAccountEntity save = repository.save(entity);
		return save.getAppId() != null ? true : false;
	}

	public boolean saveCitizenPlan(CitizenPlan plan) {

		CitizenPlanEntity entity = new CitizenPlanEntity();
		BeanUtils.copyProperties(plan, entity);
		CitizenPlanEntity save = planRepo.save(entity);

		return save.getCaseId() != null ? true : false;
	}

	public boolean saveChildDetails(ChildDetails child) {

     ChildDetailsEntity entity=new ChildDetailsEntity();
     BeanUtils.copyProperties(child, entity);
     ChildDetailsEntity save = childRepo.save(entity);
     return save.getCaseId()!=null?true:false;
	}

}
