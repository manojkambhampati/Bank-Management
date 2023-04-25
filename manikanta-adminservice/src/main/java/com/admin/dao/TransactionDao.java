package com.admin.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.admin.model.Transaction;
public interface TransactionDao extends JpaRepository<Transaction,String> {

}
