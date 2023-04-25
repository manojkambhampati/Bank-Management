package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.admin.model.*;
import com.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping("/allAccounts")
	public List<Account> showAllAccounts() {
		return service.getAllAccounts();
	}
	
	@GetMapping("/allBranches")
	public List<Branch> showAllBranches() {
		return service.getAllBranches();
	}
	
	@GetMapping("/allCustomers")
	public List<CustomerDto> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/allLoans")
	public List<Loan> getAllLoans() {
		return service.getAllLoans();
	}
	
	@PostMapping("/addAccount")
	public Account addAccount(@RequestBody Account account) {
		return service.insertAccount(account);
	}
	
	@PostMapping("/addBranch")
	public Branch addBranch(@RequestBody Branch branch) {
		return service.insertBranch(branch);
	}
	
	
}
