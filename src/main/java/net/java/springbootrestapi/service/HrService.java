package net.java.springbootrestapi.service;

import java.util.List;


import net.java.springbootrestapi.entity.Payroll;

public interface HrService {

	Payroll createPayroll(Payroll payroll);
	List<Payroll> getAllPayrolls();
	
}
