package net.java.springbootrestapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springbootrestapi.entity.Billing;
import net.java.springbootrestapi.entity.Customer;
import net.java.springbootrestapi.repository.BillingRepository;
import net.java.springbootrestapi.repository.CustomerRepository;

@Service
public class SalesServiceImpl implements SalesService{

	private CustomerRepository customerRepository;
	private BillingRepository billingRepository;
	
	@Autowired
	public SalesServiceImpl(CustomerRepository customerRepository, BillingRepository billingRepository)
	{
		this.customerRepository = customerRepository;
		this.billingRepository = billingRepository;
	}
	
	@Override
	public Customer createCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}
	
	@Override
	public List<Customer> getAllCustomers() 
	{
		List<Customer> customers = customerRepository.findAll();
        return customers;
    }

	@Override
	public Billing createBilling(Billing billing) 
	{
		Billing savedBilling = billingRepository.save(billing);
        return savedBilling;
	}

	@Override
	public List<Billing> getAllBillings() 
	{
		List<Billing> billings = billingRepository.findAll();

		return billings;
    }
}
