package com.ashokit.ies.ar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.ar.model.CitizenRegister;
import com.ashokit.ies.ar.service.CitizenService;

@Controller
public class ViewCitizensController {
	@Autowired
	private CitizenService service;

	@GetMapping("/editCitizen")
	public String editAccountById(@RequestParam("appNo") String appNo, Model model) {

		CitizenRegister citizendata = service.editCitizen(appNo);
		model.addAttribute("citizen", citizendata);
		return "createcitizen";
	}

}
