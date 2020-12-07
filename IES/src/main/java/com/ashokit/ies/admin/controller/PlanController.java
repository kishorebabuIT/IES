package com.ashokit.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.admin.model.AppPlan;
import com.ashokit.ies.admin.service.AccountService;

@Controller
public class PlanController {

	@Autowired
	private AccountService service;

	@PostMapping("/handleplan")
	public String handleSubmitPlan(@ModelAttribute("planAccount") AppPlan plan, RedirectAttributes reds) {
		boolean save = service.createPlan(plan);
		if (save) {
			if (plan.getPlanId() != null) {
				reds.addFlashAttribute("sucess", "Plan Registration Upsated...");
			} else {
				reds.addFlashAttribute("sucess", "Plan Registration Sucessfull...");
			}
		} else {
			reds.addFlashAttribute("failure", "Plan Registration Fail...");
		}
		return "redirect:planpage";
	}

}
