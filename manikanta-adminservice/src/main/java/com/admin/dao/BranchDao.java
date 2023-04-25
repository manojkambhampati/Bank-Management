package com.admin.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.admin.model.Branch;
public interface BranchDao extends JpaRepository<Branch,String>{

}
