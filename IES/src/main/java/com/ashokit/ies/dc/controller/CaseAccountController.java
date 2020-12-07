package com.ashokit.ies.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.ar.model.CitizenRegister;
import com.ashokit.ies.dc.model.CaseAccount;
import com.ashokit.ies.dc.model.CitizenPlan;
import com.ashokit.ies.dc.service.CaseService;

@Controller
public class CaseAccountController {

	@Autowired
	private CaseService service;

	@GetMapping("/getCitizen")
	public String getCitizenData(@RequestParam("appNo") String appNo, Model model) {
		CaseAccount account = new CaseAccount();
		model.addAttribute("casecitizen", account);

		CaseAccount caseById = service.getCaseById(appNo);
		model.addAttribute("citizendata", caseById);
		return "createcase";
	}

	@PostMapping("/handleAccount") 
	public String handleSubmitCaseAccount(@ModelAttribute("caseAccount") CaseAccount account) 
	{
	  
	  boolean save = service.saveCaseAccount(account);
	  /*
	  if(save) { reds.addFlashAttribute("sucess", "Registration Sucessfull..."); }
	  else { reds.addFlashAttribute("failure", "Registration Fail..."); }
	  */
	  return "selectplan";
	}

	@PostMapping("/handleplan")
	public String handleCitizenPlan(@ModelAttribute("citizenplan") CitizenPlan plan) {
		boolean save = service.saveCitizenPlan(plan);
		/*
		 * if (save) { if (plan.getCaseId() != null) { reds.addFlashAttribute("sucess",
		 * "Account Upsated..."); } else { reds.addFlashAttribute("sucess",
		 * "Registration Sucessfull..."); } } else { reds.addFlashAttribute("failure",
		 * "Registration Fail..."); }
		 */
		return "childpage";
	}
}
