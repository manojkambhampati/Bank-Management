package com.bankmanagement.service;

import java.util.List;
import com.bankmanagement.model.*;

public interface AdminService {
	public List<Account> getAllAccounts();
	public List<CustomerDto> getAllCustomers();
	public List<Branch> getAllBranches();
	public List<Loan> getAllLoans();
	public Account insertAccount(Account acc);
	public Branch insertBranch(Branch branch);
	public void deleteAccount(String account_number);
	public void deleteBranch(String branch_id);
	public void deleteCustomer(String customer_number);
	public List<CustomerDto> findCustomerByCid(String customer_number);
	
}
