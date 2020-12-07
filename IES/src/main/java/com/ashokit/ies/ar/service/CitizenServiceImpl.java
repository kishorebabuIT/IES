package com.ashokit.ies.ar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.ar.entity.CitizenRegisterEntity;
import com.ashokit.ies.ar.model.CitizenRegister;
import com.ashokit.ies.ar.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements CitizenService {
	@Autowired
	private CitizenRepository repository;

	@Override
	public String saveCitizenAcc(CitizenRegister reg) {
		CitizenRegisterEntity entity = new CitizenRegisterEntity();
		BeanUtils.copyProperties(reg, entity);
		entity.setAccStatus("Active");
		CitizenRegisterEntity saved = repository.save(entity);
		String status = saved.getAppNo();
		return status;

	}

	@Override
	public List<CitizenRegister> getAllCitizens() {
		List<CitizenRegister> listCitizens = new ArrayList<>();
		List<CitizenRegisterEntity> entityList = repository.findAll();
		entityList.forEach(entity -> {
			CitizenRegister reg = new CitizenRegister();
			BeanUtils.copyProperties(entity, reg);
			listCitizens.add(reg);

		});

		return listCitizens;
	}

	@Override
	public CitizenRegister editCitizen(String appNo) {

         Optional<CitizenRegisterEntity> optional=repository.findById(appNo);
         if(optional.isPresent())
         {
        	 CitizenRegisterEntity entity=optional.get();
        	 CitizenRegister reg=new CitizenRegister();
        	 BeanUtils.copyProperties(entity, reg);
        	 return reg;
         }
		return null;
	}

}
