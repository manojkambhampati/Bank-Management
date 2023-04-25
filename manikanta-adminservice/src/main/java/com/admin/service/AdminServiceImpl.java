package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.admin.model.Account;
import com.admin.model.Branch;
import com.admin.model.CustomerDto;
import com.admin.model.Loan;
import com.admin.dao.*;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AccountDao accountDao;
	
	@Autowired
	BranchDao branchDao;
	
	@Autowired
	LoanDao loanDao;
	
	@Autowired
	TransactionDao transactionDao;

	@Autowired
	RestTemplate template;
	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Branch> getAllBranches() {
		// TODO Auto-generated method stub
		return branchDao.findAll();
	}

	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}

	@Override
	public Account insertAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.save(account);
	}

	@Override
	public Branch insertBranch(Branch branch) {
		// TODO Auto-generated method stub
		return branchDao.save(branch);
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		return "Account is deleted.";
	}

	@Override
	public String deleteBranch(String branch_id) {
		// TODO Auto-generated method stub
		branchDao.deleteById(branch_id);
		return "Branch deleted";
	}

	@Override
	public String deleteCustomer(String customer_number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDto> findCustomerByCid(String customer_number) {
		// TODO Auto-generated method stub
		return null;
	}

}
