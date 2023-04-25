package com.bankmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagement.model.Branch;

public interface BranchDao extends JpaRepository<Branch,String>{
	
}
