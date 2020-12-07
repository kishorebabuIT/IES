package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.model.AppAccount;
import com.ashokit.ies.admin.service.AccountService;

@Controller
public class ViewAccountsController {
	@Autowired
	private AccountService service;

	
	
    @GetMapping("/editAccount")
	public String editAccountById(@RequestParam("accId") Integer accId, Model model) {

		AppAccount account = service.editAccount(accId);
		model.addAttribute("account", account);
		return "createaccount";
	}
    
   @GetMapping("/deleteAccount")
    public String deleteAccountById(@RequestParam("accId") Integer accId)
    {
    	service.deleteAccount(accId);
    	return "redirect:getAccounts";
    }
}
