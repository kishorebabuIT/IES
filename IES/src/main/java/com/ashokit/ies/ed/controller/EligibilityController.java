package com.ashokit.ies.ed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.ed.model.Eligibility;
import com.ashokit.ies.ed.service.EligibilityService;

@Controller
public class EligibilityController {
	@Autowired
	private EligibilityService service;

	@GetMapping("/getCitizenEligibility")
	public String getCitizenEligibilityData(@RequestParam("caseId") String caseId, Model model) {

		Eligibility caseById = service.getCaseById(caseId);
		
       return "searcheligiility";
	}

}
