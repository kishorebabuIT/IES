package com.ashokit.ies.ed.service;

import java.util.Optional;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.dc.entity.ChildDetailsEntity;
import com.ashokit.ies.dc.repository.ChildDetailsRepository;
import com.ashokit.ies.ed.model.Eligibility;

@Service
public class EligibilityServiceImpl implements EligibilityService {
	@Autowired
	private ChildDetailsRepository childRepo;

	@Override
	public Eligibility getCaseById(String caseId) {

		Optional<ChildDetailsEntity> findById = childRepo.findById(caseId);
		if (findById.isPresent()) {
			 ChildDetailsEntity entity = findById.get();

          Eligibility eligibility=new Eligibility();

			BeanUtils.copyProperties(entity, eligibility);
			return eligibility;
		}
		return null;
	}

}
