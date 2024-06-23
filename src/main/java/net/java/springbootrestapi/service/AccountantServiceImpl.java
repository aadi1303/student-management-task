package net.java.springbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springbootrestapi.entity.Billing;
import net.java.springbootrestapi.entity.Payroll;
import net.java.springbootrestapi.repository.BillingRepository;
import net.java.springbootrestapi.repository.PayrollRepository;

@Service
public class AccountantServiceImpl implements AccountantService{

	private BillingRepository billingRepository;
	private PayrollRepository payrollRepository;
	
	@Autowired
	public AccountantServiceImpl(BillingRepository billingRepository,PayrollRepository payrollRepository)
	{
		this.billingRepository = billingRepository;
		this.payrollRepository = payrollRepository;
	}
	
	@Override
	public List<Billing> getAllBills() {
		List<Billing> bills = billingRepository.findAll();
		return bills;
	}
	
	@Override
	public List<Payroll> getAllPayroll() {
		List<Payroll> payrolls = payrollRepository.findAll();
		return payrolls;
	}
	
}
