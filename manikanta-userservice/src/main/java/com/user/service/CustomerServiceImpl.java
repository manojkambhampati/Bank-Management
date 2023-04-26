package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.user.dao.CustomerDao;
import com.user.model.Customer;
import com.user.model.LoanDto;
import com.user.model.LoanProxy;
import com.user.model.TransactionDto;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	RestTemplate template;
	
	
	@Autowired
	LoanProxy loanProxy;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public LoanDto applyLoan(LoanDto loan) {
		// TODO Auto-generated method stub
		//return template.applyLoan(loan);
		return template.postForObject("http://admin-service/admin/applyLoan",loan,LoanDto.class);
	}

	@Override
	public List<TransactionDto> getTransactionsByType(@RequestParam("type") String transaction_type) {
		// TODO Auto-generated method stub
		return loanProxy.getTransactionsByType(transaction_type);
	}
	/*
	@Override
	public List<TransactionDto> searchAllTransactions(String account_number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TransactionDto> searchByAccountNumandDate(String account_number, String date) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<TransactionDto> searchByAccountNumandType(String account_number, String transaction_type) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
*/

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}


}
