package com.user.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("ADMIN-SERVICE")
public interface LoanProxy {
	
	@PostMapping("/applyLoan")
	public LoanDto applyLoan(@RequestBody LoanDto loan);
	
	@GetMapping("/makeTransaction")
	public List<TransactionDto> getTransactionsByType(@RequestParam("type") String transaction_type);
}
