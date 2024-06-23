package net.java.springbootrestapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springbootrestapi.entity.Billing;
import net.java.springbootrestapi.entity.Payroll;
import net.java.springbootrestapi.service.AccountantService;

@RestController
@RequestMapping("/accountant")
public class AccountantContoller {

	private AccountantService accountantService;
	
	@Autowired
	public AccountantContoller(AccountantService accountantService)
	{
		this.accountantService = accountantService;
	}
	
	@GetMapping("/billingsA")
	public ResponseEntity<List<Billing>> getAllBills()
	{
		List<Billing> bills = accountantService.getAllBills();
		return ResponseEntity.ok(bills);
	}
	
	@GetMapping("/payrollsA")
	public ResponseEntity<List<Payroll>> getAlgetAllPayroll()
	{
		List<Payroll> payrolls = accountantService.getAllPayroll();
		return ResponseEntity.ok(payrolls);
	}
}
