package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Customer;
import com.user.model.LoanDto;
import com.user.model.TransactionDto;
import com.user.service.CustomerService;

@RestController
@RequestMapping("/user")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/register")
	public Customer registerCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/allCustomers")
	public List<Customer> showAllCustomers() {
		return service.getAllCustomers();
	}
	@PostMapping("/applyLoan")
	public LoanDto applyForLoan(@RequestBody LoanDto loan) {
		return service.applyLoan(loan);
	}
	
	@GetMapping("/makeTransaction")
	public List<TransactionDto> makeTransaction(@RequestParam("type") String transaction_type) {
		// TODO Auto-generated method stub
		return service.getTransactionsByType(transaction_type);
	}
}
