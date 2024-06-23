package net.java.springbootrestapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springbootrestapi.entity.Payroll;
import net.java.springbootrestapi.repository.PayrollRepository;

@Service
public class HrServiceImpl implements HrService{

	private PayrollRepository payrollRepository;
	
	@Autowired
	public HrServiceImpl(PayrollRepository payrollRepository)
	{
		this.payrollRepository = payrollRepository;
		
	}
	
	@Override
	public Payroll createPayroll(Payroll payroll) {
		Payroll createPayroll = payrollRepository.save(payroll);
		return createPayroll;
	}

	@Override
	public List<Payroll> getAllPayrolls() {
		List<Payroll> payroll = payrollRepository.findAll();
		return payroll;
	}

}
