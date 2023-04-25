package com.bankmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagement.model.Loan;

public interface LoanDao extends JpaRepository<Loan,String>{

}
