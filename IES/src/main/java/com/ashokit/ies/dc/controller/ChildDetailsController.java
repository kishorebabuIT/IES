package com.ashokit.ies.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.dc.model.ChildDetails;
import com.ashokit.ies.dc.service.CaseService;

@Controller
public class ChildDetailsController {

	@Autowired
	private CaseService service;

	@PostMapping("/handlechildplan")
	public String handleChildPlan(@ModelAttribute("childaccount") ChildDetails child, RedirectAttributes reds) {
		boolean save = service.saveChildDetails(child);
		if (save) {

			reds.addFlashAttribute("sucess", "Registration Sucessfull...");
		}

		else {
			reds.addFlashAttribute("failure", "Registration Fail...");
		}
		return "redirect:searchcitizen";
	}
}
