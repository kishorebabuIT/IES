package com.ashokit.ies.ar.service;

import java.util.List;

import com.ashokit.ies.ar.model.CitizenRegister;

public interface CitizenService {
	
	public String saveCitizenAcc(CitizenRegister reg);
	
	public List<CitizenRegister> getAllCitizens();
	
	public CitizenRegister editCitizen(String appNo);

}
