package net.java.springbootrestapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.java.springbootrestapi.entity.Billing;

import net.java.springbootrestapi.entity.Customer;
import net.java.springbootrestapi.service.SalesService;


@RestController
@RequestMapping("/sales")
public class SalesController {
	
	private SalesService salesService;
	
	@Autowired
	public SalesController(SalesService salesService)
	{
		this.salesService = salesService;
	}
	@PostMapping("/customersPost")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
		Customer c = salesService.createCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(c);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> gatAllCustomers()
	{
		List<Customer> customers = salesService.getAllCustomers();
        return ResponseEntity.ok(customers);
	}
	
	@PostMapping("/billings")
	public ResponseEntity<Billing> createBilling(@RequestBody Billing billing) 
	{
	    Billing createdBilling = salesService.createBilling(billing);
	    return ResponseEntity.status(HttpStatus.CREATED).body(createdBilling);
	}
	
	@GetMapping
	public ResponseEntity<List<Billing>> getAllBillings()
	{
		List<Billing> billings = salesService.getAllBillings();
		return ResponseEntity.ok(billings);
	}

}
