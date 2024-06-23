package net.java.springbootrestapi.service;

import java.util.List;

import net.java.springbootrestapi.entity.Billing;
import net.java.springbootrestapi.entity.Customer;



public interface SalesService {

	Customer createCustomer(Customer customer);
	List<Customer> getAllCustomers();
	
	Billing createBilling(Billing billing);
	List<Billing> getAllBillings();
}
