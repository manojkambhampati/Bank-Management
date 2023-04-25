package com.bankmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagement.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction,String>{

}
