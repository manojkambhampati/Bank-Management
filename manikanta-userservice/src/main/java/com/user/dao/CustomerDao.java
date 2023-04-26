package com.user.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.user.model.Customer;
import com.user.model.LoanDto;
import com.user.model.TransactionDto;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String>{
	
	/*
	public TransactionDto makeTransaction(TransactionDto transaction);
	
	@Query("select t from Transaction where t.account_number=?")
	public List<TransactionDto> searchAllTransactions(String account_number);
	
	
	public Optional<TransactionDto> searchByAccountNumandDate(String account_number,String date);
	
	*/
	
}
