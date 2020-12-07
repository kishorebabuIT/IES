package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.model.AppPlan;
import com.ashokit.ies.admin.service.AccountService;
@Controller
public class ViewPlansController {
	
	@Autowired
	private AccountService service;

	
	
	@GetMapping("/editPlan")
	public String editPlanById(@RequestParam("planId") Integer planId, Model model) {

		AppPlan account = service.editPlan(planId);
		model.addAttribute("planAccount", account);
		return "createplan";
	}

}
