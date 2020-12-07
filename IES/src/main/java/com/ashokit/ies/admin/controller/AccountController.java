package com.ashokit.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService service;

	@PostMapping("/handleAccount")
	public String handleSubmitAccount(@ModelAttribute("account") AppAccount account, RedirectAttributes reds) {
		boolean save = service.saveAccount(account);
		if (save) {
			if (account.getAccId() != null) {
				reds.addFlashAttribute("sucess", "Account Upsated...");
			} else {
				reds.addFlashAttribute("sucess", "Registration Sucessfull...");
			}
		} else {
			reds.addFlashAttribute("failure", "Registration Fail...");
		}
		return "redirect:welcomepage";
	}

}
