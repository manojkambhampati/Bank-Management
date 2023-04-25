package com.admin.dao;
import com.admin.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountDao extends JpaRepository<Account,String>{

}
