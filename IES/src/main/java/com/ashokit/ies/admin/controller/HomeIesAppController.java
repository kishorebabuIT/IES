package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.model.AppPlan;
import com.ashokit.ies.admin.service.AccountService;
import com.ashokit.ies.ar.model.CitizenRegister;
import com.ashokit.ies.ar.service.CitizenService;

@Controller
public class HomeIesAppController {

	@Autowired
	private AccountService service;
	@Autowired
	private CitizenService serviceCitizen;

	@GetMapping({ "/", "/home" })
	public String loadHomePage() {
		return "index";
	}

	@GetMapping("/welcomepage")
	public String loadAccountPage(Model model) {
		AppAccount account = new AppAccount();
		model.addAttribute("account", account);
		return "createaccount";
	}

	@GetMapping("/getAccounts")
	public String viewAllAccounts(Model model) {
		List<AppAccount> accountsList = service.getAllAccounts();
		model.addAttribute("accounts", accountsList);
		return "viewAccounts";
	}

	@GetMapping("/planpage")
	public String loadPlanPage(Model model) {
		AppPlan plan = new AppPlan();
		model.addAttribute("planAccount", plan);
		return "createplan";
	}

	@GetMapping("/getplans")
	public String viewAllplans(Model model) {
		List<AppPlan> accountsList = service.getAllPlans();
		model.addAttribute("plans", accountsList);
		return "viewplans";
	}

	@GetMapping("/citizenpage")
	public String loadCitizenPage(Model model) {
		CitizenRegister citizenAccount = new CitizenRegister();
		model.addAttribute("citizen", citizenAccount);
		return "createcitizen";
	}

	@GetMapping("/viewCitizens")
	public String getAllCitizens(Model model) {
		List<CitizenRegister> citizensList = serviceCitizen.getAllCitizens();
		model.addAttribute("citizens", citizensList);
		return "viewcitizens";
	}

	@GetMapping("/loadcaseplan")
	public String loadCasePage() {

		return "searchcitizen";
	}
	
	@GetMapping("/verifyEligibilityplan")
	public String loadEligibilityPage() {

		return "searcheligibility";
	}
}
