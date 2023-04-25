package com.admin.service;
import com.admin.model.*;
import java.util.*;

public interface AdminService {
	public List<Account> getAllAccounts();
	public List<CustomerDto> getAllCustomers();
	public List<Branch> getAllBranches();
	public List<Loan> getAllLoans();
	public Account insertAccount(Account acc);
	public Branch insertBranch(Branch branch);
	public String deleteAccount(String account_number);
	public String deleteBranch(String branch_id);
	public String deleteCustomer(String customer_number);
	public List<CustomerDto> findCustomerByCid(String customer_number);
	
}
