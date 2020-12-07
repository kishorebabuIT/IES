package com.ashokit.ies.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.entity.AppAccountEntity;
import com.ashokit.ies.admin.entity.AppPlanEntity;
import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.model.AppPlan;
import com.ashokit.ies.admin.repository.AppAccountRepository;
import com.ashokit.ies.admin.repository.AppPlanRepository;

@Service
public class AccountServiceImpl<planRepo> implements AccountService {

	@Autowired
	private AppAccountRepository repo;

	@Autowired
	private AppPlanRepository planRepo;

	@Override
	public boolean saveAccount(AppAccount account) {
		AppAccountEntity entity = new AppAccountEntity();
		BeanUtils.copyProperties(account, entity);
		AppAccountEntity saved = repo.save(entity);
		return saved.getAccId() != null ? true : false;
	}

	@Override
	public List<AppAccount> getAllAccounts() {

		List<AppAccount> accounts = new ArrayList<>();
		List<AppAccountEntity> entityList = repo.findAll();
		entityList.forEach(entity -> {
			AppAccount account = new AppAccount();
			BeanUtils.copyProperties(entity, account);
			accounts.add(account);
		});

		return accounts;
	}

	@Override
	public AppAccount editAccount(Integer accId) {

		Optional<AppAccountEntity> optional = repo.findById(accId);

		if (optional.isPresent()) {
			AppAccountEntity entity = optional.get();
			AppAccount acc = new AppAccount();
			BeanUtils.copyProperties(entity, acc);
			return acc;
		}
		return null;

	}

	@Override
	public boolean deleteAccount(Integer accId) {

		repo.deleteById(accId);
		return true;
	}

	@Override
	public boolean createPlan(AppPlan plan) {
		AppPlanEntity entity = new AppPlanEntity();
		BeanUtils.copyProperties(plan, entity);
		AppPlanEntity saved = planRepo.save(entity);
		return saved.getPlanId() != null ? true : false;
	}

	@Override
	public List<AppPlan> getAllPlans() {

		List<AppPlan> accounts = new ArrayList<>();
		List<AppPlanEntity> entityList = planRepo.findAll();
		entityList.forEach(entity -> {
			AppPlan account = new AppPlan();
			BeanUtils.copyProperties(entity, account);
			accounts.add(account);
		});

		return accounts;

	}

	@Override
	public AppPlan editPlan(Integer PlanId) {

		Optional<AppPlanEntity> optional = planRepo.findById(PlanId);

		if (optional.isPresent()) {
			AppPlanEntity entity = optional.get();
			AppPlan acc = new AppPlan();
			BeanUtils.copyProperties(entity, acc);
			return acc;
		}
		return null;

	}

	@Override
	public boolean deletePlan() {
		// TODO Auto-generated method stub
		return false;
	}

}
