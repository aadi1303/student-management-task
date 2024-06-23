package net.java.springbootrestapi.service;

import java.util.List;

import net.java.springbootrestapi.entity.Billing;
import net.java.springbootrestapi.entity.Payroll;

public interface AccountantService {
	List<Billing> getAllBills();
	
	List<Payroll> getAllPayroll();

}
