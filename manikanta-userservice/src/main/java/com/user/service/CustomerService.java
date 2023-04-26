package com.user.service;
import com.user.model.*;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public LoanDto applyLoan(LoanDto loan);
	
	public List<TransactionDto> getTransactionsByType(@RequestParam("type") String transaction_type);

	/*
	public TransactionDto makeTransaction(TransactionDto transaction);
	
	public List<TransactionDto> searchAllTransactions(String account_number);
	
	public Optional<TransactionDto> searchByAccountNumandDate(String account_number,String date);
	
	public Optional<TransactionDto> searchByAccountNumandType(String account_number,String transaction_type);
	*/
}
