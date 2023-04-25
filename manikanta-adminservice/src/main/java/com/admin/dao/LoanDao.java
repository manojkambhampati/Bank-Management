package com.admin.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.admin.model.Loan;
public interface LoanDao extends JpaRepository<Loan,String>{

}
