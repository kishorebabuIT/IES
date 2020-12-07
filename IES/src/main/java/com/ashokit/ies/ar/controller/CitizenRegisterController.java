package com.ashokit.ies.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.ar.model.CitizenRegister;
import com.ashokit.ies.ar.service.CitizenService;

@Controller
public class CitizenRegisterController {

	@Autowired
	private CitizenService service;

	@PostMapping("/handlecitizen")
	public String handleSubmitCitizenAccount(@ModelAttribute("citizen") CitizenRegister reg, RedirectAttributes reds) {
		String status = service.saveCitizenAcc(reg);
		if (status != null) {
			if (reg.getAppNo() != null) {
				reds.addFlashAttribute("sucess", "Citizen Registration Updated Sucessfully");
			} else {
				reds.addFlashAttribute("sucess", "Citizen Registration Sucessfull with Application No :" + status);
			}
		}

		else {
			reds.addFlashAttribute("failure", "Registration Fail...");
		}
		return "redirect:citizenpage";
	}
}
